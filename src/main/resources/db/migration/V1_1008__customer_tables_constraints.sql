-- Foreign Key Constraints
alter table contact add constraint fk_cust_contact foreign key (customer_id, tenant_id) references customer (id, tenant_id);
alter table address add constraint fk_cust_address foreign key (customer_id, tenant_id) references customer (id, tenant_id);
alter table customer_aircraft add constraint fk_cust_customer_aircraft_1 foreign key (customer_id, customer_tenant_id) references customer (id, tenant_id);
alter table customer_aircraft add constraint fk_cust_customer_aircraft_2 foreign key (aircraft_id, aircraft_tenant_id) references aircraft (id, tenant_id);
