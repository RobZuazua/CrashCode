class LogUtil:
    def log_results_int(self, question: str, expected_response: int, actual_response: int):
        self.print_question(question);
        if (actual_response == expected_response):
            print("✅ PASS! Integer Value = " + str(actual_response));
        else :
            print("🔥 Try Again! Expected Integer Value: " + str(expected_response) + "\n" + "But your code returned Integer Value: " + str(actual_response));
        
        print();

    def log_results_set(self, question: str, expected_response: set, actual_response: str):
        self.print_question(question);
        if (actual_response in expected_response):
            print("✅ PASS! String Value = " + actual_response);
        else :
            print("🔥 Try Again! Expected String Value in : " + repr(expected_response) + "\n" + "But your code returned String Value: " + actual_response);
        
        print();

    def log_results(self, question: str, expected_response: str, actual_response: str):
        self.print_question(question);
        if (actual_response == expected_response):
            print("✅ PASS! String Value = " + actual_response);
        else :
            print("🔥 Try Again! Expected String Value: " + expected_response + "\n" + "But your code returned String Value: " + actual_response);
        
        print();

    def log_results_bool(self, question: str, expected_response: bool, actual_response: bool):
        self.print_question(question);
        if (actual_response == expected_response):
            print("✅ PASS! Bool Value = " + str(actual_response));
        else :
            print("🔥 Try Again! Expected Bool Value: " + str(expected_response) + "\n" + "But your code returned Bool Value: " + str(actual_response));
        
        print();
    
    def print_question(self, question: str):
        print("Question " + question);
