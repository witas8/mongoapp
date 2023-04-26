Definition:
-	MongoDB is a document-based NoSQL Database = Not Only SQL (Structured Query Language).
Document Databases are for unstructured data (don’t know future final data structure/schema) and for scalability strategy as scaling horizontally by adding hardware (other nodes into cluster).
-	Mongo stores data in JSON like document. This is automatically taken care by MongoDB, and Developers take care only on JSON files. This is type sensitive language (size of letters matters).
-	CAP = Heart of NoSQL DB = Consistency (all nodes see the same data at the same time) + Availability (give the same data in distributed system) + P (partition tolerance – system does not fail, regardless of if any data is dropped between nodes). No NoSQL DB can satisfy all (C, A, P).
For MongoDB a priority is to be consistent and partition-tolerant database (C, P).
-	Flexible structure, faster than SQL database as PostgreSQL (no relationships, no joins).
-	NoSQL (Not Only SQL) database is good to use when we struggle with complicated data structure and want to retrieve data very quickly (relational db, document db as MongoDB, key-value db, wide-culumn stores with dynamic column as Casandra, graph db)
-	NoSQL database is a database that does not use typical relationship where the join commends from typical relational sql are involved to bound data from different database.
 -	CRUD (Create/Insert, Read/Find. Update, Delate)
db.collection.insertOne() or .find() or .updateOne()/.replaceOne() (replace doc) or .deleteOne()
db.collection.find() with query, projection, read concern (for cluster)
-	There are already build method that supports query operations as – comparison, logical, array…
https://www.mongodb.com/docs/manual/reference/operator/query/
https://www.bmc.com/blogs/mongodb-operators/
https://www.w3schools.com/mongodb/mongodb_query_operators.php
-	All write operations in MongoDB are atomic on the level of a single document.
Java and Mongo – Atomic guarantees that the value may be updated atomically (multithreads). An atomic operation is a write operation which either completes entirely or does not complete at all. In the case of distributed transactions, which involve writes to multiple documents, all writes to each document must succeed for the transaction to succeed. Atomic operations cannot partially complete. Hence, after modification the values of doc are everywhere changed.
-	Concurrency control allows multiple applications to run concurrently without causing data inconsistency or conflicts.
-	If the collection does not exist, then the insert method will create the collection
-	To inserted document will be automatically added unchangeable filed “_id”
-	MongoDB Compass is a graphical user interface for the MongoDB engine.
In Mongo Cloud we create an account and define pricing plan and then copy and paste the link to the Mongo Compass. In compass we create a database and collection. Remember that 
not only name of database must be specified, but name of collection as well must be
-	Necessary command that can be used in the cmd to insert single documents inside a collection
(database and collection are defined in a compass before). CLS command means clear terminal.
