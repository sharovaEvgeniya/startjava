\echo '--вывод всей таблицы'
SELECT *
  FROM jaegers;

\echo '--отображение только не уничтоженных роботов'
SELECT *
  FROM jaegers
 WHERE status = 'Active';

\echo '--отображение роботов нескольких серий: Mark-1, Mark-4'
SELECT *
  FROM jaegers
 WHERE mark
    IN ('Mark-1', 'Mark-4');

\echo '--отображение всех роботов, кроме Mark-1, Mark-4'
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo '--сортировка таблицы по убыванию по столбцу mark'
SELECT *
  FROM jaegers
 ORDER BY mark
 DESC;

\echo '--отображение информации о самом старом роботе'
SELECT *
FROM jaegers
WHERE launch = (SELECT MIN(launch)
                FROM jaegers);

\echo '--отображение роботов, которые уничтожили больше всех kaiju'
SELECT *
FROM jaegers
WHERE kaijuKill = (SELECT MAX(kaijuKill)
                   FROM jaegers);

\echo '--отображение среднего веса роботов'
SELECT AVG(weight)
  FROM jaegers;

\echo '--увеличение на единицу кол-ва уничтоженных kaiju у роботов, которые не разрушенны'
UPDATE jaegers
SET kaijuKill = kaijuKill + 1
WHERE status = 'Active';

\echo '--удаление уничтоженных роботов'
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';
