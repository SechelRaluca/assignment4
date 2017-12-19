create table Package
(
	id int auto_increment
		primary key,
	description varchar(255) null,
	destinationCity varchar(255) null,
	name varchar(255) null,
	senderCity varchar(255) null,
	tracking bit not null,
	receiver_id int null,
	route_id int null,
	sender_id int null
)
;

create index FKc98cguoxu5a0lfli7trhsm34m
	on Package (route_id)
;

create index FKiovhupcbqpr1s5eqhf87kkwk0
	on Package (receiver_id)
;

create index FKtsryn2q6r621um7cj12gjt9n
	on Package (sender_id)
;

create table Packagee
(
	id int auto_increment
		primary key,
	description varchar(255) null,
	destinationCity varchar(255) null,
	name varchar(255) null,
	senderCity varchar(255) null,
	tracking bit not null,
	receiver_id int null,
	route_id int null,
	sender_id int null
)
;

create index FK3ba8osjola0npax5o4vjdpc8t
	on Packagee (route_id)
;

create index FKhbc7l8nvf5a26u641ikvo7ecq
	on Packagee (receiver_id)
;

create index FKlun2n2b5k3xpihb58n5dw433j
	on Packagee (sender_id)
;

create table Role
(
	id int auto_increment
		primary key,
	role varchar(255) null
)
;

create table Route
(
	id int auto_increment
		primary key
)
;

alter table Package
	add constraint FKc98cguoxu5a0lfli7trhsm34m
foreign key (route_id) references Route (id)
;

alter table Packagee
	add constraint FK3ba8osjola0npax5o4vjdpc8t
foreign key (route_id) references Route (id)
;

create table RoutePair
(
	id int auto_increment
		primary key,
	City varchar(255) null,
	time time null
)
;

create table Route_RoutePair
(
	routes_id int not null,
	routePairs_id int not null,
	constraint FKfegmewvqft8d1davey2locglo
	foreign key (routes_id) references Route (id),
	constraint FK9n1a8p9ou7rxr161okeh1cisj
	foreign key (routePairs_id) references RoutePair (id)
)
;

create index FK9n1a8p9ou7rxr161okeh1cisj
	on Route_RoutePair (routePairs_id)
;

create index FKfegmewvqft8d1davey2locglo
	on Route_RoutePair (routes_id)
;

create table User
(
	id int auto_increment
		primary key,
	password varchar(255) null,
	username varchar(255) null,
	role_id int null,
	constraint FK84qlpfci484r1luck11eno6ec
	foreign key (role_id) references Role (id)
)
;

create index FK84qlpfci484r1luck11eno6ec
	on User (role_id)
;

alter table Package
	add constraint FKiovhupcbqpr1s5eqhf87kkwk0
foreign key (receiver_id) references User (id)
;

alter table Package
	add constraint FKtsryn2q6r621um7cj12gjt9n
foreign key (sender_id) references User (id)
;

alter table Packagee
	add constraint FKhbc7l8nvf5a26u641ikvo7ecq
foreign key (receiver_id) references User (id)
;

alter table Packagee
	add constraint FKlun2n2b5k3xpihb58n5dw433j
foreign key (sender_id) references User (id)
;

