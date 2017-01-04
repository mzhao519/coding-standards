/**
 * JavaScript naming conversation
 * reference: http://www.j-io.org/Javascript-Naming_Conventions
 * 
 * <p><strong>In General</strong></p>
 * use functionNamesLikeThis, 
 * variableNamesLikeThis, 
 * ClassNamesLikeThis, 
 * EnumNamesLikeThis, 
 * methodNamesLikeThis, 
 * CONSTANT_VALUES_LIKE_THIS, 
 * foo.namespaceNamesLikeThis.bar,
 * and file_names_like_this.js.
 */

/**
 *  1. Properties and methods
 *  Private properties and methods should be named with a trailing underscore.
 *	Protected properties and methods should be named without a trailing underscore (like public ones).   
*/
function _privateFn(){}
function publicFn(){}

/**
 *  2. Method and function parameter
 *  Optional function arguments start with opt_.
 *  Functions that take a variable number of arguments should have the last argument named var_args. You may not refer to var_args in the code; use the arguments array.
 *  Optional and variable arguments can also be specified in @param annotations. Although either convention is acceptable to the compiler, using both together is preferred.
*/

function example(param1, opt_param2, var_args){
	
}

/**
 * 3. Use namespaces for global variables
 * Global name conflicts are difficult to debug, and can cause intractable problems when two projects try to integrate. 
 * In order to make it possible to share common JavaScript code, we've adopted conventions to prevent collisions.
 * Use namespaces for global code
 * ALWAYS prefix identifiers in the global scope with a unique pseudo namespace related to the project or library. 
 */	
var ccv = {};
ccv.createResume = function() {};

/**
 * 4. Class Name Example
 * file name is: naming_conventions.js
 */

var NamingConventions = {
    /**
    * @constant
    * The variable which will not be modified 
    * use all caps and use underscore between words.
    */
	HOST_URL:'http//www.codecanteen.com',
    
    /**
    *  Instance variable naming
    */
	baseJsUrl:'',  
	module:'',  
	
	init: function(){
		this.setBaseJsUrl_();
		// get a global variable
		this. module = ccv.moduleName;
	},
	
    /**
    * @private
    * private methods should use a leading underscore to separate 
    * them from public methods (although this does not technically make a method 
    * private) .
    */
	_setBaseJsUrl_: function(){
		this.baseJsUrl = this.HOST_URL + '/Public /js/admin/';
	},
	
	/**
     * @public 
	 * A method should always start with a small letter and begin with a verb connect with 
     * a noun which is capitalized. namely, it is camelCase.
	 * 
	 */
	getHtml: function(menuName){
		var $this = this;
        
        /** A constructor function starting with new should 
         *  always start with a capital letter
         */
        var app = new App();
        
		var url = this.HOST_URL + '/admin.php/Public/getHtml/menu/'+menuName;
		$('#container').load(url,function(){
			$this.getJs(menuName);
		});	
	}
};