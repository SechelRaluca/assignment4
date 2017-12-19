# ROLE
INSERT INTO Role (id, role) VALUES (1, 'ADMIN');
INSERT INTO Role (id, role) VALUES (2, 'CLIENT');

#USER
INSERT INTO User (id,password, username, role_id) VALUES (1,'client', 'client', 2);
INSERT INTO User (id,password, username, role_id) VALUES (2,'client1', 'client1', 2);

#ROUTE
INSERT INTO Route (id) VALUES (1);
INSERT INTO Route (id) VALUES (2);

#ROUTEPAIR
INSERT INTO RoutePair (id, City, time) VALUES (1, 'Cluj', '12:00:00');
INSERT INTO RoutePair (id, City, time) VALUES (2, 'Bucuresti', '14:00:00');

#ROUTE_ROUTEPAIR
INSERT INTO Route_RoutePair (routes_id, routePairs_id) VALUES (1, 1);
INSERT INTO Route_RoutePair (routes_id, routePairs_id) VALUES (1, 2);

#PACKAGE
INSERT INTO Packagee (id, description, destinationCity, name, senderCity, tracking, receiver_id, route_id, sender_id) VALUES (1, 'desc', 'Bucuresti', 'package', 'Cluj', false, 1, 1, 2);