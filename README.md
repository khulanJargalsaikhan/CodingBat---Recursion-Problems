# CodingBat---Recursion-Problems

# array11
Given an array of ints, compute recursively the number of times that the value 11 appears in the array. 
We'll use the convention of considering only the part of the array that begins at the given index. 
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

	array11([1, 2, 11], 0) 		-- 1
  
	array11([11, 11], 0) 		-- 2
  
	array11([1, 2, 3, 4], 0) 	-- 0
  
# count7  
Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields 
the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

		count7(717) -- 2
    
		count7(7) -- 1
    
		count7(123) -- 0
    
# countHi2      
Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
however do not count "hi" that have an 'x' immedately before them.
	
	countHi2("ahixhi") -- 1
  
	countHi2("ahibhi") -- 2
  
	countHi2("xhixhi") -- 0
  
	countHi2("hixhi") -- 1  
  
# countX
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

	countX("xxhixx") -- 4
  
	countX("xhixhix") -- 3
  
	countX("hi") -- 0  
  
  
  
