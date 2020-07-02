CREATE TABLESPACE sistemtokoalattulis_07048
datafile 'D:\KULIAH\Praktikum Basis Data\Modul 1\Praktikum\sistemtokoalattulis_07048.dbf'
size 30M;

Tablespace created.

CREATE USER alphinda_07048
IDENTIFIED BY alphinda
DEFAULT TABLESPACE sistemtokoalattulis_07048
QUOTA 30M ON sistemtokoalattulis_07048;

User created.

GRANT ALL PRIVILEGES TO alphinda_07048;

Grant succeeded.

CONN alphinda_07048/alphinda
Connected.

CREATE TABLE Login
(
id_login integer not null,
username VARCHAR2(20),
password CHAR(20),
constraint PK_Login primary key (id_login)
);

Table created.

CREATE TABLE Transaksi
(
id_transaksi INTEGER not null,
jumlah_barang INTEGER,
total_harga INTEGER,
jumlah_pembayaran INTEGER,
jumlah_kembalian INTEGER,
constraint PK_Transaksi primary key (id_transaksi)
);

Table created.

CREATE TABLE Barang
(
id_barang INTEGER not null,
id_jenis_barang INTEGER,
nama_barang VARCHAR2(15),
harga_barang INTEGER,
stock_barang INTEGER,
constraint PK_barang primary key (id_barang)
);

Table created.

CREATE TABLE Jenis_Barang
(
id_jenis_barang INTEGER not null,
nama_jenis_barang VARCHAR2(15),
constraint PK_jenis_barang primary key (id_jenis_barang)
);

Table created.

CREATE TABLE Detail_Transaksi
(
id_transaksi INTEGER not null,
id_barang INTEGER,
jumlah_barang INTEGER
);

Table created.

ALTER TABLE Barang
add constraint FK_Id_Jenis_Barang FOREIGN KEY (id_jenis_barang)
references Jenis_Barang (id_jenis_barang);

Table altered.

ALTER TABLE Detail_Transaksi
add constraint FK_Id_Transaksi FOREIGN KEY (id_transaksi)
references Transaksi (id_transaksi)
add constraint FK_Id_Barang FOREIGN KEY (id_barang)
references Barang (id_barang);

Table altered.

create sequence id_transaksi
minvalue 1
maxvalue 99999999
start with 1
increment by 1
nocache;

create sequence id_barang
minvalue 1
maxvalue 99999999
start with 1
increment by 1
nocache;

create sequence id_jenis_barang
minvalue 1
maxvalue 99999999
start with 1
increment by 1
nocache;

SELECT * FROM BARANG JOIN JENIS_BARANG ON BARANG.ID_JENIS_BARANG = JENIS_BARANG.ID_JENIS_BARANG

SELECT * FROM DETAIL_TRANSAKSI JOIN BARANG ON DETAIL_TRANSAKSI.ID_BARANG = BARANG.ID_BARANG JOIN JENIS_BARANG ON BARANG.ID_JENIS_BARANG = JENIS_BARANG.ID_JENIS_BARANG WHERE DETAIL_TRANSAKSI.ID_TRANSAKSI = ID_TRANSAKI

create view dml_barang as
select * from barang;


