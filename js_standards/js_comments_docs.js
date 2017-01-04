/** 
 * Javascript Comment 
 * reference https://google-styleguide.googlecode.com/svn/trunk/javascriptguide.xml?showone=Comments#Comments 
 *
 * In General:
 * All files, classes, methods and properties should be documented with JSDoc comments with the appropriate tags and types. 
 * Textual descriptions for properties, methods, method parameters and method return values should be included unless obvious from the property, method, or parameter name.
 * Inline comments should be of the // variety.
 * Complete sentences are recommended but not required. Complete sentences should use appropriate capitalization and punctuation.
 * 
 * Basic Principle
 * 1. As short as possible
 * 2. As long as necessary
 *
*/

/** 
 * 1. Comment Syntax
 * The JSDoc syntax is based on JavaDoc. Many tools extract metadata from JSDoc comments to perform code validation and optimizations. These comments must be well-formed.
 */
/**
 * A JSDoc comment should begin with a slash and 2 asterisks.
 * Inline tags should be enclosed in braces like {@code this}.
 * @desc Block tags should always start on their own line.
 */

/**
 * 2. JSDoc Indentation
 * If you have to line break a block tag, you should treat this as breaking a code statement and indent it four spaces.
 */
/**
 * Illustrates line wrapping for long param/return descriptions.
 * @param {string} foo This is a param with a description too long to fit in
 *     one line.
 * @return {number} This returns something that has a description too long to
 *     fit in one line.
 */
project.MyClass.prototype.method = function(foo) {
  return 5;
};

/**
 * 3. You should not indent the @fileoverview command. You do not have to indent the @desc command.
 * Even though it is not preferred, it is also acceptable to line up the description.
 */
/**
 * This is NOT the preferred indentation method.
 * @param {string} foo This is a param with a description too long to fit in
 *                     one line.
 * @return {number} This returns something that has a description too long to
 *                  fit in one line.
 */
project.MyClass.prototype.method = function(foo) {
  return 5;
};

/**
 * 4. HTML in JSDoc
 * Like JavaDoc, JSDoc supports many HTML tags, like <code>, <pre>, <tt>, <strong>, <ul>, <ol>, <li>, <a>, and others.
 * This means that plaintext formatting is not respected. So, don't rely on whitespace to format JSDoc:
 */
/**
 * Computes weight based on three factors:
 * <ul>
 * <li>items sent
 * <li>items received
 * <li>last timestamp
 * </ul>
 */

/**
 * 5. Top/File-Level Comments
 * A copyright notice and author information are optional. 
 * File overviews are generally recommended whenever a file consists of more than a single class definition. 
 * The top level comment is designed to orient readers unfamiliar with the code to what is in this file.
 * If present, it should provide a description of the file's contents and any dependencies or compatibility information. As an example:
 */
/**
 * @fileoverview Description of file, its uses and information
 * about its dependencies.
 */

/**
 * 6. Class Comments
 * Classes must be documented with a description and a type tag that identifies the constructor.
 */
/**
 * Class making something fun and easy.
 * @param {string} arg1 An argument that makes this more interesting.
 * @param {Array.<number>} arg2 List of numbers to be processed.
 * @constructor
 * @extends {goog.Disposable}
 */
project.MyClass = function(arg1, arg2) {
  // ...
};
goog.inherits(project.MyClass, goog.Disposable);

/**
 * 7. Method and Function Comments
 * Parameter and return types should be documented. 
 * The method description may be omitted if it is obvious from the parameter or return type descriptions. 
 * Method descriptions should start with a sentence written in the third person declarative voice.
 */
/**
 * Operates on an instance of MyClass and returns something.
 * @param {project.MyClass} obj Instance of MyClass which leads to a long
 *     comment that needs to be wrapped to two lines.
 * @return {boolean} Whether something occurred.
 */
function PR_someMethod(obj) {
  // ...
}

/**
 * 8. Property Comments
 */
/** @constructor */
project.MyClass = function() {
  /**
   * Maximum number of things per pane.
   * @type {number}
   */
  this.someProperty = 4;
}

/**
 * 9. Useful JSDoc Tag Reference
 * <ul>
 *    <li> @fileoverview Makes the comment block provide file level information.
 *    <li> {@code goog.iter.StopIteration}
 *    <li> @author
 *    <li> @const {string}
 *    <li> @define value can be updated in the build/setting file, like DEBUG=true/false;
 *    <li> @constructor
 *    <li> @param {number} groupNum Subgroup id to query.
 *    <li> @private Used in conjunction with a leading underscore on the method
 *    <li> @public
 *    <li> @protected
 *    <li> @return {string}
 *   
 * </ul>
 */
asdfasdf