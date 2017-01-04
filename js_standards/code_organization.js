/**
 * <p>JavaScript Code Organizations
 * reference: http://learn.jquery.com/code-organization/concepts/
 * </p>
 * 
 * <p>Key Concepts</p>
 * <ul>
 *  <li>Your code should be divided into units of functionality - modules, services,
 *      etc. Avoid the temptation to have all of your code in one huge
 *      $(document).ready() block. This concept, loosely, is known as encapsulation.</li>
 *  <li>Don’t repeat yourself. Identify similarities among pieces of functionality, 
 *      and use inheritance techniques to avoid repetitive code.
 *  <li>Despite jQuery’s DOM-centric nature, JavaScript applications are not all about
 *      the DOM. Remember that not all pieces of functionality need to - or should - 
 *      have a DOM representation.
 *  <li>Units of functionality should be loosely coupled, that is, a unit of 
 *      functionality should be able to exist on its own, and communication between 
 *      units should be handled via a messaging system such as custom events or pub/sub.
 *      Stay away from direct communication between units of functionality whenever 
 *      possible.
 * </ul>
 * 
 * <p>The Module Pattern</p>
 * <p>It overcomes some of the limitations of the object literal, offering privacy 
 *   for variables and functions while exposing a public API if desired.
 * </p>
*/
// The module pattern example
 var CodeOrganization = (function(){
	/**
	 * store the device screen width and height once this script loaded
	 * @private
	 */
	var screenSize = {
		width:'',
		height:''
	};
	
	/**
	 * get screen size when screen resized
	 * @public
	 */
	var getScreenSize = function(){
		$(window).resize(function(){
			screenSize.width  = $(window).width();
			screenSize.height = $(window).height();
		});
		$(window).resize();
	};
	
	// Public API
	return {
		getScreenSize: getScreenSize,
	};
	
})();

$(function(){
	CodeOrganization.getScreenSize();
});
