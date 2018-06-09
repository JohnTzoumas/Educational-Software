package com.atl.edusoftware.web

import com.atl.edusoftware.annotations.Request

class ListRequest {
    int page = 1
    int rowsPerPage = 20
    String by
    boolean asc = false
    Boolean audited = false
}

@Request
class QuestionRequest extends ListRequest {
    Integer id
    String text
    String chapter
}