/* required for uuid_generate_v4() function to generate UUID */
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE course_cart (
    id UUID default uuid_generate_v4 (),
    course VARCHAR(10),
    description VARCHAR(50),
    startdate date,
    enddate date,
    PRIMARY KEY (ID)    
);


CREATE TABLE course_catalog (
    id UUID default uuid_generate_v4 (),
    courseName VARCHAR(30);
	courseID VARCHAR(10);
	department VARCHAR(20);
	startDate date;
	endDate date;
	availableSeats number;
	term VARCHAR(30);
    PRIMARY KEY (ID)    
);

CREATE TABLE personal_information (
    id UUID default uuid_generate_v4 (),
    name VARCHAR(30);
	dob DATE;
	gender VARCHAR(30);
	address VARCHAR(50);
	city VARCHAR(30);
	state VARCHAR(30);
	zip_code number;
    PRIMARY KEY (ID)    
);

CREATE TABLE wishlist (
    id UUID default uuid_generate_v4 (),
    course VARCHAR(30);
	startdate date;
	enddate date;
    PRIMARY KEY (ID)    
);