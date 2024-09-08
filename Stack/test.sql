-- CREATE TABLE emp (
--     empId  INTEGER,
--     empName VARCHAR(20)
--     bID    INTEGER
--     CONSTRAINT e_eId_pk PRIMARY KEY (empId)
--     CONSTRAINT e_bid_fk FOReign key (bID) REFERENCES branch(bID)
-- );


-- INSERt INTO 
-- emp (empId, empName, bID)
-- VALUES 
-- (1, 'John', 1),
-- (2, 'Jane', 2),
-- (3, 'Jack', 3),
-- (4, 'Jill', 4),
-- (5, 'Joe', 5);


-- SELECT E.deptNo MIN(E.salary), MAX(E.salary), AVG(E.salary)
-- FROM emp e_bid_fk
-- GROUP BY E.deptNo;


-- SELECT B.title
-- FROM book B
-- WHERE B.authorId = (SELECT
--                     A.authorId
--                     FROM emp Author A
--                     WHERE A.empName = 'John';)

-- select M.name, M.bID
-- from member M join borrowing B
-- on M.mID = B.mID
-- where B.bookID =  (SELECT
--                     B.bookID
--                     FROM book B
--                     WHERE B.title = 'The Hobbit';)


-- SELECT E.salary
-- FROM emp E
-- ORDER BY E.salary DESC
-- LIMIT 1 OFFSET 1;

-- SELECT E.name
-- FROM emp E
-- WHERE E.salary > (
--     SELECT AVG(salary)
--     FROM emp 
--     WHERE deptNo = E.deptNo  
-- )

-- SELECT O.orderID, C.customerName, O.oderAmount
-- FROM order O JOIN customer C 
-- ON O.customerId =C.customerId
-- where O.orderID = "1"


-- SELECT E.empName
-- From emp E join order O
-- ON E.empId = O.customerId
