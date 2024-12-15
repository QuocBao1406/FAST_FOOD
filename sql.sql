USE FAST_FOOD;

UPDATE FOOD
SET Food_Image = (SELECT Food_Image FROM OPENROWSET(BULK N'C:\Users\ADMIN\Downloads\buger_thantre.jpg', SINGLE_BLOB) AS Image)
WHERE Food_Id = '1';