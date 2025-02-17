INSERT INTO product_type (name)
VALUES ('Electronics'),
       ('Books'),
       ('Clothing'),
       ('Furniture'),
       ('Toys');

INSERT INTO product (name, starting_price, status, type_id)
VALUES ('Smartphone', 500.0, 'ACTIVE', 1),
       ('Laptop', 1200.0, 'PENDING', 1),
       ('Tablet', 300.0, 'ACTIVE', 1),
       ('Novel', 20.0, 'CLOSED', 2),
       ('Science Book', 35.0, 'ACTIVE', 2),
       ('Children\'s Book', 15.0, 'CANCELLED', 2),
       ('T-shirt', 10.0, 'ACTIVE', 3),
       ('Jeans', 30.0, 'PENDING', 3),
       ('Jacket', 50.0, 'ACTIVE', 3),
       ('Sofa', 800.0, 'CLOSED', 4),
       ('Dining Table', 600.0, 'ACTIVE', 4),
       ('Bed', 700.0, 'PENDING', 4),
       ('Action Figure', 25.0, 'ACTIVE', 5),
       ('Board Game', 40.0, 'CLOSED', 5),
       ('Puzzle', 15.0, 'ACTIVE', 5),
       ('Toy Car', 10.0, 'ACTIVE', 5);