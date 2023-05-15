package com.supportportal.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000; // 5 days expressed in milliseconds
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String GET_ARRAYS_LLC = "Get Arrays, LLC";
    public static final String GET_ARRAYS_ADMINISTRATION = "User Management Portal";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = { "/domainecompetence/add", "/domainecompetence/listwithuser", "/domainecompetence/createRank", "/domainecompetence/createContribution", "/evalComite/add", "/evalComite/update", "/evalComite/getEvalComite", "/objectives/add", "/objectives/delete", "/objectives/updateDescription", "/objectives/updateEtat", "/objectives/list", "/projet/list", "/projet/add", "/projet/update", "/autoEval/add", "/autoEval/update", "/autoEval/getAutoEvalByUser", "/managerEval/add", "/managerEval/update", "/managerEval/getManagerEvalByUser","/trajectoire/add", "/trajectoire/update", "/trajectoire/getTrajectoire", "/user/add", "/user/update", "/user/updateRank", "/user/updatepassword", "/user/updateProfileImage", "/user/login", "/user/list", "/user/register", "/user/image/**", "/user/resetpassword/**","/user/sendotp/**"};
    //public static final String[] PUBLIC_URLS = { "**" };
}

