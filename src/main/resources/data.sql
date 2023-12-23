INSERT INTO categories (name) VALUES ( 'Soda' );
INSERT INTO categories (name) VALUES ( 'Bier' );
INSERT INTO drinks (name, is_alcoholic, purchase_price, sale_price, available_quantity, img_url,category_id) VALUES ('Cool Lemonade', false, 1.50, 2.99, 100, 'http://example.com/lemonade.jpg',1);
INSERT INTO drinks (name, is_alcoholic, purchase_price, sale_price, available_quantity, img_url, category_id) VALUES ('Iced Tea', false, 1.00, 2.50, 150, 'http://example.com/icedtea.jpg',2);


-- TODO Refactor drink to product
-- TODO add sample data for Purchase and user
