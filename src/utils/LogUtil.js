class LogUtil {
    constructor() {
    }
  
    logResultsInt(question, expectedResponse, actualResponse) {
        this.printQuestion(question);
        if (actualResponse == expectedResponse){
            console.log("✅ PASS! Integer Value = " + actualResponse);
        } else {
            console.log("🔥 Try Again! Expected Integer Value: " + expectedResponse + "\n" + "But your code returned Integer Value: " + actualResponse);
        }
        console.log();
    }

    logResultsBool(question, expectedResponse, actualResponse) {
        this.printQuestion(question);
        if (actualResponse == expectedResponse){
            console.log("✅ PASS! Bool Value = " + actualResponse);
        } else {
            console.log("🔥 Try Again! Expected Bool Value: " + expectedResponse + "\n" + "But your code returned Bool Value: " + actualResponse);
        }
        console.log();
    }

    logResultsString(question, expectedResponse, actualResponse) {
        this.printQuestion(question);
        if (actualResponse == expectedResponse){
            console.log("✅ PASS! String Value = " + actualResponse);
        } else {
            console.log("🔥 Try Again! Expected String Value: " + expectedResponse + "\n" + "But your code returned String Value: " + actualResponse);
        }
        console.log();
    }

    logResultsSet(question, expectedResponses, actualResponse) {
        this.printQuestion(question);
        if (expectedResponses.includes(actualResponse)) {
            console.log("✅ PASS! String Value = " + actualResponse);
        } else {
            console.log("🔥 Try Again! Expected String Value in: " + expectedResponses.toString() + "\n" + "But your code returned String Value: " + actualResponse);
        }
        console.log();
    }

    printQuestion(question) {
        console.log("Question " + question);
    }
}

module.exports = LogUtil;