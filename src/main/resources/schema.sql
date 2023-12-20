create table if not exists drink(
                      product_id int auto_increment,
                      name varchar(255) NOT NULL,
                      is_alcoholic boolean NOT NULL,
                      purchase_price double NOT NULL,
                      sale_price double NOT NULL,
                      available_quantity int NOT NULL,
                      img_url varchar(255),
                      category_id int NOT NULL
);

create table if not exists category(
    category_id int auto_increment NOT NULL,
    name varchar(255) NOT NULL
);

create table if not exists sale(
    sale_id int auto_increment,
    drink_id int,
    quantity int,
    sale_date date
);


create table if not exists "user"(
    user_id int auto_increment,
    username varchar(255),
    password varchar(255),
    role varchar(255)
);
/* TODO add table for data, purchase, purchaseItem, saleItem, USer */