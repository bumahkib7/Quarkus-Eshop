ALTER TABLE carts
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE carts
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE categories
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE categories
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE customers
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE customers
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE order_items
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE order_items
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE orders
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE orders
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE payments
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE payments
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE products
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE products
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE reviews
    ADD last_modified TIMESTAMP WITHOUT TIME ZONE;

ALTER TABLE reviews
    ALTER COLUMN last_modified SET NOT NULL;

ALTER TABLE carts
    DROP CONSTRAINT fk8ba3sryid5k8a9kidpkvqipyt;

ALTER TABLE carts
    DROP COLUMN customer_id;

ALTER TABLE carts
    DROP COLUMN lastmodified;

ALTER TABLE carts
    DROP COLUMN status;

ALTER TABLE categories
    DROP COLUMN lastmodified;

ALTER TABLE customers
    DROP COLUMN lastmodified;

ALTER TABLE order_items
    DROP COLUMN lastmodified;

ALTER TABLE orders
    DROP COLUMN lastmodified;

ALTER TABLE payments
    DROP COLUMN lastmodified;

ALTER TABLE products
    DROP COLUMN lastmodified;

ALTER TABLE reviews
    DROP COLUMN lastmodified;

ALTER TABLE payments
    ALTER COLUMN amount TYPE DECIMAL USING (amount::DECIMAL);