package com.aram.hovakyan.api;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


public interface BaseController {

    default Pageable getPageable(final Integer page, final Integer size){
        Pageable pageable = null;
        if (page != null && size != null && size > 0) {
            pageable =  PageRequest.of(page, size);
        } else {
            pageable = Pageable.unpaged();
        }
        return pageable;
    }
}
