package com.atl.edusoftware.web

import com.atl.edusoftware.annotations.Request

@Request
class UserLoginRequest{
    String email
    String password
}