-- Insert records into the users table
INSERT INTO users (username, password, email, first_name, last_name, role, phone_number, profile_picture) VALUES
('john_doe', 'password123', 'john@example.com', 'John', 'Doe', 'student', '1234567890', 'profile1.jpg'),
('jane_smith', 'password456', 'jane@example.com', 'Jane', 'Smith', 'instructor', '1234567891', 'profile2.jpg'),
('alice_johnson', 'password789', 'alice@example.com', 'Alice', 'Johnson', 'student', '1234567892', 'profile3.jpg'),
('bob_brown', 'password321', 'bob@example.com', 'Bob', 'Brown', 'instructor', '1234567893', 'profile4.jpg'),
('charlie_green', 'password654', 'charlie@example.com', 'Charlie', 'Green', 'student', '1234567894', 'profile5.jpg');

-- Insert records into the courses table
INSERT INTO courses (title, description, instructor_id) VALUES
('Introduction to Programming', 'Learn the basics of programming using Python.', 2),
('Data Science Fundamentals', 'An introduction to data science concepts and tools.', 2),
('Web Development', 'Build dynamic websites using HTML, CSS, and JavaScript.', 4),
('Machine Learning Basics', 'Understand the fundamentals of machine learning.', 4),
('Database Management Systems', 'Learn how to manage and design databases.', 2);

-- Insert records into the enrollments table
INSERT INTO enrollments (user_id, course_id) VALUES
(1, 1),
(1, 2),
(3, 1),
(3, 3),
(5, 4);

-- Insert records into the course_materials table
INSERT INTO course_materials (course_id, title, content, material_type) VALUES
(1, 'Python Basics.pdf', 'Introduction to Python programming.', 'PDF'),
(1, 'Variables and Data Types.pdf', 'Overview of variables and data types in Python.', 'PDF'),
(2, 'Data Science 101.pptx', 'Fundamentals of Data Science.', 'PPTX'),
(3, 'HTML for Beginners.mp4', 'Learn HTML basics.', 'Video'),
(4, 'ML Algorithms.docx', 'Overview of popular ML algorithms.', 'DOCX');

-- Insert records into the assignments table
INSERT INTO assignments (course_id, title, description, due_date) VALUES
(1, 'Assignment 1', 'Create a simple Python program.', '2024-10-15'),
(2, 'Data Analysis Project', 'Analyze a dataset using Python.', '2024-10-20'),
(3, 'Website Design Project', 'Create a personal website.', '2024-10-25'),
(4, 'Machine Learning Model', 'Build a simple ML model.', '2024-10-30'),
(5, 'Database Design Assignment', 'Design a simple database schema.', '2024-11-05');

-- Insert records into the submissions table
INSERT INTO submissions (assignment_id, user_id, grade, feedback) VALUES
(1, 1, 85.00, 'Good job on the assignment!'),
(2, 3, 90.00, 'Excellent analysis of the dataset.'),
(3, 1, 75.00, 'Website design needs improvement.'),
(4, 5, 95.00, 'Great work on the ML model!'),
(5, 3, 80.00, 'Database schema is well-structured.');

-- Insert records into the chapters table
INSERT INTO chapters (course_id, title, content, chapter_number) VALUES
(1, 'Chapter 1: Introduction', 'Content of Chapter 1.', 1),
(1, 'Chapter 2: Data Types', 'Content of Chapter 2.', 2),
(2, 'Chapter 1: What is Data Science?', 'Content of Chapter 1.', 1),
(3, 'Chapter 1: Introduction to HTML', 'Content of Chapter 1.', 1),
(4, 'Chapter 1: Supervised Learning', 'Content of Chapter 1.', 1);
