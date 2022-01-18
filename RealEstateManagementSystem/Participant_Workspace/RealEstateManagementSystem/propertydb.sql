//create database propertydb;

connect propertydb;

create table owner(
	ownerid int(5) PRIMARY KEY,
	ownername varchar(20),
	address varchar(20)
	);
	
insert into owner values(1001, 'Vikas Sharma', 'Mumbai');
insert into owner values(1002, 'Shamlal Verma', 'Pune');
insert into owner values(1003, 'Vimal Shah', 'Ahmadabad');
insert into owner values(1004, 'Shravan Shah', 'Delhi');
insert into owner values(1005, 'Dev Malhotra', 'Mumbai');

create table property_transactions(
	transactionId int(5) PRIMARY KEY,
	ownerId int(5),
	bankname varchar(10),
	propertyId int(5),
	dealtype varchar(10),
	dealdate date,
	sellingrate decimal(12,2)
);
	
	
insert into property_transactions(transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(1,1003,'HDFC',106,'purchase','2015-11-25');	
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(2,1004,'SBI',105,'purchase','2015-04-10');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values (3,1004,'SBI',108,'purchase','2015-04-15');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(4,1004,'SBI',101,'purchase','2015-04-21');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(5,1005,'ICICI',115,'purchase','2015-06-05');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(6,1002,'PNB',113,'purchase','2015-05-20');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(7,1001,'HDFC',102,'purchase','2015-04-05');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(8,1001,'IDBI',107,'purchase','2015-05-25');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(9,1001,'KOTAK',109,'purchase','2015-10-05');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(10,1005,'KOTAK',110,'purchase','2015-01-07');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(11,1003,'PNB',112,'purchase','2015-11-10');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(12,1002,'HDFC',103,'purchase','2015-08-15');	
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(13,1004,'HDFC',114,'purchase','2015-05-29');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(14,1004,'SBI',104,'purchase','2015-06-15');
insert into property_transactions (transactionId,ownerId,bankname,propertyId,dealtype,dealdate)
values(15,1005,'PNB',111,'purchase','2015-08-05');

insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(16,1003,106,'sales','2016-01-31',9000);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(17,1004,105,'sales','2016-02-15',10000);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(18,1004,108,'sales','2016-02-15',6000);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(19,1004,101,'sales','2015-07-15',9000);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(20,1005,115,'sales','2016-09-15',5500);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(21,1002,113,'sales','2016-03-20',9500);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(22,1001,102,'sales','2015-12-20',1000);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(23,1001,107,'sales','2015-07-20',6000);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(24,1001,109,'sales','2016-03-20',7500);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(25,1005,110,'sales','2016-02-20',9500);
insert into property_transactions (transactionId,ownerId,propertyId,dealtype,dealdate,sellingrate)
values(26,1003,112,'sales','2016-03-30',8000);


