# Food delivery APP

# Functionsl Requiements;
Register Restaurants
User Search restaurants -> name,cusine,or list of items
Place order - user selects restaurant, pick items, create order
Track Order status - Places,preparing,out_for_delivery,delivered
Assign Drlivery partner

# API's
Post /restaurant
Get /restaurant?cusine=x
Post /orders
Get /Order/{id}
Post /orders/{id}/assign
PUT /orders/{id}/status

# Entity
User 
Restaurant 
MenuItem
Order
Delivery Partner

