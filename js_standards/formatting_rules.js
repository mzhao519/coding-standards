/** JavaScript Formatting
 * reference: https://google-styleguide.googlecode.com/svn/trunk/javascriptguide.xml?showone=Code_formatting#Code_formatting
 * Import js check style ccv_js_coding_style.xml into your eclipse
 * reference https://github.com/jokeyrhyme/eclipse-formatter-profiles/blob/master/google-style-guide-javascript-eclipse.xml
*/

/**
 * 1. Curly Braces
 * Because of implicit semicolon insertion, always start your curly braces on the same line as whatever they're opening. For example:
*/
if (something) {
  // ...
} else {
  // ...
}
/**
 * 2. Array and Object Initializers
 * Single-line array and object initializers are allowed when they fit on a line:
 * Multiline array initializers and object initializers are indented 2 spaces, with the braces on their own line, just like blocks.
*/
var arr = [1, 2, 3];  // No space after [ or before ].
var obj = {a: 1, b: 2, c: 3};  // No space after { or before }.
// Object initializer.
var inset = {
  top: 10,
  right: 20,
  bottom: 15,
  left: 12
};
// Array initializer.
this.rows_ = [
  '"Slartibartfast" <fjordmaster@magrathea.com>',
  '"Zaphod Beeblebrox" <theprez@universe.gov>',
  '"Ford Prefect" <ford@theguide.com>',
  '"Arthur Dent" <has.no.tea@gmail.com>',
  '"Marvin the Paranoid Android" <marv@googlemail.com>',
  'the.mice@magrathea.com'
];
// Used in a method call.
goog.dom.createDom(goog.dom.TagName.DIV, {
  id: 'foo',
  className: 'some-css-class',
  style: 'display:none'
}, 'Hello, world!');
//Long identifiers or values present problems for aligned initialization lists, so always prefer non-aligned initialization. For example:
CORRECT_Object.prototype = {
  a: 0,
  b: 1,
  lengthyName: 2
};
/**
 * 3. Function Arguments
 * When possible, all function arguments should be listed on the same line. 
 * If doing so would exceed the 80-column limit, the arguments must be line-wrapped in a readable way. 
 * To save space, you may wrap as close to 80 as possible, or put each argument on its own line to enhance readability. 
 * The indentation may be either four spaces, or aligned to the parenthesis. Below are the most common patterns for argument wrapping:
 */
// Four-space, wrap at 80.  Works with very long function names, survives
// renaming without reindenting, low on space.
goog.foo.bar.doThingThatIsVeryDifficultToExplain = function(
    veryDescriptiveArgumentNumberOne, veryDescriptiveArgumentTwo,
    tableModelEventHandlerProxy, artichokeDescriptorAdapterIterator) {
  // ...
};

// Four-space, one argument per line.  Works with long function names,
// survives renaming, and emphasizes each argument.
goog.foo.bar.doThingThatIsVeryDifficultToExplain = function(
    veryDescriptiveArgumentNumberOne,
    veryDescriptiveArgumentTwo,
    tableModelEventHandlerProxy,
    artichokeDescriptorAdapterIterator) {
  // ...
};

// Parenthesis-aligned indentation, wrap at 80.  Visually groups arguments,
// low on space.
function foo(veryDescriptiveArgumentNumberOne, veryDescriptiveArgumentTwo,
             tableModelEventHandlerProxy, artichokeDescriptorAdapterIterator) {
  // ...
}
// Parenthesis-aligned, one argument per line.  Emphasizes each
// individual argument.
function bar(veryDescriptiveArgumentNumberOne,
             veryDescriptiveArgumentTwo,
             tableModelEventHandlerProxy,
             artichokeDescriptorAdapterIterator) {
  // ...
}
/**
 * 4. Passing Anonymous Functions
 * When declaring an anonymous function in the list of arguments for a function call, 
 * the body of the function is indented two spaces from the left edge of the statement, 
 * or two spaces from the left edge of the function keyword. 
 * This is to make the body of the anonymous function easier to read (i.e. not be all squished up into the right half of the screen).
 */


prefix.something.reallyLongFunctionName('whatever', function(a1, a2) {
  if (a1.equals(a2)) {
    someOtherLongFunctionName(a1);
  } else {
    andNowForSomethingCompletelyDifferent(a2.parrot);
  }
});

var names = prefix.something.myExcellentMapFunction(
    verboselyNamedCollectionOfItems,
    function(item) {
      return item.name;
    });

/**
 * 4. Indenting wrapped lines
 * Except for array literals, object literals, and anonymous functions, 
 * all wrapped lines should be indented either left-aligned to a sibling expression above, 
 * or four spaces (not two spaces) deeper than a parent expression (where "sibling" and "parent" refer to parenthesis nesting level).
 */
someWonderfulHtml = '' +
                    getEvenMoreHtml(someReallyInterestingValues, moreValues,
                                    evenMoreParams, 'a duck', true, 72,
                                    slightlyMoreMonkeys(0xfff)) +
                    '';

thisIsAVeryLongVariableName =
    hereIsAnEvenLongerOtherFunctionNameThatWillNotFitOnPrevLine();

thisIsAVeryLongVariableName = siblingOne + siblingTwo + siblingThree +
    siblingFour + siblingFive + siblingSix + siblingSeven +
    moreSiblingExpressions + allAtTheSameIndentationLevel;

thisIsAVeryLongVariableName = operandOne + operandTwo + operandThree +
    operandFour + operandFive * (
        aNestedChildExpression + shouldBeIndentedMore);

someValue = this.foo(
    shortArg,
    'Some really long string arg - this is a pretty common case, actually.',
    shorty2,
    this.bar());

if (searchableCollection(allYourStuff).contains(theStuffYouWant) &&
    !ambientNotification.isActive() && (client.isAmbientSupported() ||
                                        client.alwaysTryAmbientAnyways())) {
  ambientNotification.activate();
}

/**
 * 5. Blank lines
 * Use newlines to group logically related pieces of code. For example:
 */

doSomethingTo(x);
doSomethingElseTo(x);
andThen(x);

nowDoSomethingWith(y);

andNowWith(z);

/**
 * 6. Binary and Ternary Operators
 * Always put the operator on the preceding line. 
 * Otherwise, indenting to the line position of the first operand.
 */

var x = a ? b : c;  // All on one line if it will fit.
// Indenting to the line position of the first operand is also OK.
var z = a ?
        moreComplicatedB :
        moreComplicatedC;
//This includes the dot operator.
var x = foo.bar().
        doSomething().
        doSomethingElse();