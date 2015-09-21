package br.com.doublelogic.hanzo.service.util;

/**
 * Created by diegoalvessaidsimao on 21/09/15.
 */
public class LocalBroadcastMessages {

    public class COMMON {
        public static final String INTERN_PROBLEM = "internProblem";
        public static final String INTERNET_PROBLEM = "internetProblem";
    }

    public class REST {
        public static final String CONNECTION_PROBLEM = "connectionProblem";
        public static final String HTTP_400_ERROR = "connectionProblem";
        public static final String HTTP_500_ERROR = "connectionProblem";
        public static final String JSON_PARSER_ERROR = "jsonParserError";
    }

    public class SERVICE {
    }

}
