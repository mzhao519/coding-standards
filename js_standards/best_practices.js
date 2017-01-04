/** JavaScript Best Programming Practice
 * reference: http://jshint.com/docs/options/
 * https://google-styleguide.googlecode.com/svn/trunk/javascriptguide.xml?showone=Code_formatting#JavaScript_Language_Rules
 */
/**
* 1. Declarations with var: Always
*/
function test() {
   myVar = 'Hello, World';
   console.log(myvar);  // myvar did not declare
}

/**
* 2. Always use semicolons at the end of the statements 
*
*/
var a = 3        // if compress the code it will be var a=3var b=4 
var b = 4         // so, adding semicolons at the end of the statement. it will be right after compress.

/**
* 3. Be careful to use == and ===  
*/
if(null == undefined) {	 // the statement will print 1 
   console.info(1);
}
else{
    console.info(2);
}

/**
* 4. Prefer ' over "
*    For consistency single-quotes (') are preferred to double-quotes ("). This is helpful when creating strings that include HTML:
*
*/
var a = "high"; // should use sing quotes a = 'high';
var b = 'low';


/**
*  5. Don’t declare Function in the statement blocks. 
*
*/
if(a>5) {
    var func = function(){};
}

/**
*  6. Don’t use with() in your code.
*  The semantics of the with statement can cause confusion among   
*  developers and accidental definition of global variables.
*
*/
with(document){}

/**
*  7. Don’t use eval() in your code.
*     The use of eval is discouraged because it can make your code vulnerable 
*     to various injection attacks and it make it hard for javascript interpreter 
*     to do certain optimizations. 
*
*/
eval('var a = 1; return a++;');

/**
*   8. Don’t modify prototypes of built in objects
*
*/
Array.prototype.count = function (value) {
	return 4; 
};


/**
 * 9. True and False Boolean Expressions
 * The following are all false in boolean expressions:
 * null
 * undefined
 * '' the empty string
 * 0 the number
 * But be careful, because these are all true:
 * '0' the string
 * [] the empty array
 * {} the empty object
 * This means that instead of this:
 * while (x != null) {
 * you can write this shorter code (as long as you don't expect x to be 0, or the empty string, or false):

 * while (x) {
 * And if you want to check a string to see if it is null or empty, you could do this:

 * if (y != null && y != '') {
 * But this is shorter and nicer:
 */


/**
 * 10. Conditional (Ternary) Operator (?:)
 * Instead of this:
 * if (val) {
 *   return foo();
 * } else {
 *   return bar();
 * }
 * We prefer the following:
 * 
 */
var test = (val) ? foo() : bar();

/**
 * 11. && and ||
 * "||" has been called the 'default' operator
 */
/** @param {*=} opt_win */
function foo(opt_win) {
	//use this:
	var win = opt_win || window;
	//not like this:
	/**var win;
	if (opt_win) {
	    win = opt_win;
	} else {
		win = window;
	}**/
	//use this
	if (node && node.kids && node.kids[index]) {
		foo(node.kids[index]);
	}
	//not like this:
	if (node) {
		if (node.kids) {
			if (node.kids[index]) {
				foo(node.kids[index]);
			}
		}
	}
}
/**
 * 12. Iterating over Node Lists
 */
//use this: (This works well for all collections and arrays as long as the array does not contain things that are treated as boolean false.)
var paragraphs = document.getElementsByTagName('p');
for (var i = 0, paragraph; paragraph = paragraphs[i]; i++) {
  doSomething(paragraph);
}
//not like this: (This means that getting a property like length is O(n), and iterating over the list by re-checking the length will be O(n^2).)
var paragraphs = document.getElementsByTagName('p');
for (var i = 0; i < paragraphs.length; i++) {
  doSomething(paragraphs[i]);
}

/**
 * 13. undefined and null
 * undefined variable is a variable that as never been declared, or never assigned a value.
 */
if(a==null){}//varialbe could be null or undefined
if(a!=null){}//varialbe could be not null or undefined, will throw error if a is not defined
if(typeof a ==='undefined'){}//a is undefined, not null, not other values
if(typeof a ==='undefined'&&(!'a' in window)){}//a is undefined and not be declared
if(a ===null){}//a is assigned null value	

/**
 * 14. Be careful to use this
 * The semantics of this can be tricky. At times it refers to the global object (in most places), the scope of the caller (in eval), a node in the DOM tree (when attached using an event handler HTML attribute), a newly created object (in a constructor), or some other object (if function was call()ed or apply()ed).
 * Because this is so easy to get wrong, limit its use to those places where it is required:
 * in constructors
 * in methods of objects (including in the creation of closures)
*/


