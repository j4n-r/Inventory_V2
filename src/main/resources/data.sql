INSERT INTO drink (name, is_alcoholic, purchase_price, sale_price, available_quantity, img_url,category_id) VALUES ('Cool Lemonade', false, 1.50, 2.99, 100, 'http://example.com/lemonade.jpg',1);
INSERT INTO drink (name, is_alcoholic, purchase_price, sale_price, available_quantity, img_url, category_id) VALUES ('Iced Tea', false, 1.00, 2.50, 150, 'http://example.com/icedtea.jpg',2);
INSERT INTO category (name) VALUES ( 'Soda' );
INSERT INTO category (name) VALUES ( 'Bier' );
INSERT INTO sale ( drink_id, quantity, sale_date) VALUES (  2, 4, '2023-12-20' );
INSERT INTO sale (drink_id, quantity, sale_date) VALUES ( 1, 10, '2023-12-24' );
INSERT INTO "user"(username, password, role) VALUES ( 'Admin@test.com', 'admin', 'ROLE_ADMIN' );

//TODO Refactor drink to product
//TODO add sample data for Purchase and user