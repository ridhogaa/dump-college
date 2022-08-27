create table mahasiswa (
	npm char(10) primary key,
	nik char(16) unique not null,
	nama_depan varchar(20) not null,
	nama_belakang varchar(20),
	tempat_lahir varchar(15) not null,
	tgl_lahir date not null
);

insert into mahasiswa values ('1402001054', '1234567890123456', 'Herika', 'Hayurani', 'Jakarta', 
 to_date('28-04-1999' , 'dd-mm-yyyy'));
 
insert into mahasiswa values ('1402003001', '1234567891123456', 'Nurmaya', null, 'Jakarta', 
 to_date('08-14-2002' , 'mm-dd-yyyy'));
 

delete from mahasiswa where npm = '1402003001';

alter table mahasiswa add column alamat text;

 
select * from mahasiswa;

create table mata_kuliah (
	id serial primary key,
	nama varchar(50) not null,
	semester int not null,
	sks int not null,
	jenis varchar(15) not null
);

alter sequence mata_kuliah_id_seq restart with 100000;

insert into mata_kuliah (nama, semester, sks, jenis) values ('Basis Data 1', 2, 3, 'wajib');

insert into mata_kuliah (nama, semester, sks, jenis) values 
('Agama 1', 1, 1, 'wajib'),
('Agama 2', 2, 1, 'wajib'),
('Agama 3', 3, 1, 'wajib')
;

select * from mata_kuliah;

truncate table mata_kuliah;



create table pendaftaran (
	npm char(10) not null,
	id_mk int not null,
	tahun_akademik char(5) not null,
	tgl_daftar timestamptz default current_timestamp not null,
	nilai double precision,
	constraint pendaftaran_pk primary key (npm, id_mk, tahun_akademik),
	constraint pendaftaran_fk1 foreign key (npm) references mahasiswa (npm),
	constraint pendaftaran_fk2 foreign key (id_mk) references mata_kuliah (id)
);

insert into pendaftaran values ('1402001054', 100003, 20202, default, null);
insert into pendaftaran values ('1402001054', 100000, 20202, default, null);
insert into pendaftaran values ('1402001054', 100003, 20211, default, null);

delete from pendaftaran;

truncate table pendaftaran;

select * from pendaftaran;

// null ke not null bisa
alter table pendaftaran alter column nilai set not null;

// not null ke null tidak bisa
alter table pendaftaran alter column tgl_daftar set null;


