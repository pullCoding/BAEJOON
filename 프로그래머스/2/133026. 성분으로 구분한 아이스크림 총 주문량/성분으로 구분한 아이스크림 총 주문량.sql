-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) TOTAL_ORDER
from FIRST_HALF F, ICECREAM_INFO I
where F.FLAVOR = I.FLAVOR
group by INGREDIENT_TYPE
order by TOTAL_ORDER;