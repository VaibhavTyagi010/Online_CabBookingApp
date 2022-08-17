# Cab Booking Application
It is built to support all the functionality related to managing a taxi booking system. 
We will discuss each aspect of this project in detail for enhanced understanding.
The Taxi Booking System project is designed in Spring Boot and Hibernate along with the source code.
Admin will be responsible for keeping a check on the booking of taxis, managing taxis, drivers,
payments, etc. On the other hand, Users can register themselves, log in using the login credentials,
view and book the taxi, view charges, etc.

we  have designed a cab Booking System project in spring boot & hibernate, which has three main roles i.e. Admin and User. Admin is the primary user and can add/remove/update any details related to the system. Admin can manage registered users and drivers. Admin can Add/Remove/Update cab and their details from the system. Admin can also categorize taxis accordingly. Admin will be responsible for keeping a check on all the bookings done by users. Admin can View/Confirm/Cancel bookings done by users. Admin can check and manage the availability of cab and also, keep a track of the status of all the cab that are engaged.

Admin can set/update prices and charges of the taxi rides. Admin can manage the drivers and their details.

On the other hand, users can register. Users can search and view the taxis available. Users can search taxis by entering the location.

Admin can maintain a database of drivers. Drivers have to register on the portal. Drivers will be able to see the booking done by users and details of users like name, source, and destination location.

# Cab Booking Application ER diagram
![cab_booking_3](https://user-images.githubusercontent.com/68966858/185020617-92914a9c-b5e2-4b3b-aa36-dc6a26454cba.jpeg)

# Functions of Admin, Cutomer, Driver
## Through admin we can : 
1. Can Log in/Log out of the system.<br>
2. Admin can View/Edit/Delete taxis into the system.<br>
3. Admin can View/Confirm/Cancel booking done by the User.<br>
4. Can check payments done by User.<br>
5. Can check the availability of cabs and drivers.<br>
6. Can manage driver staff.<br>
7. Can change the charge.<br>
8. Can change password.<br>

## Through Customer we can:
1. Can Log in/Log out of the system.
2. Can Manage “My profile”.<br>
3. Can search for cab.<br>
4. Users can Book/Cancel cabs.<br>
5. Can change password.<br>

## Through Driver we can:
1. Add a driver in the system.
2. Update driver details.
3. Delete a driver from the system.
4. Get the list of all drivers.
5. Get the list of all best available(rated>=4.5) drivers.
