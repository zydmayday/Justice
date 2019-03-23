package com.liszt.justice.api;


import org.springframework.web.bind.annotation.RestController;

/**
 * This class is a REST controller, which collects
 * all the APIs for consuming some kinds of representational
 * state of the REST resources from the front-end.
 *
 * @author Jiang
 */
@RestController
public class ConsumeApi {

    /**
     * Client can save a record using this API through front-end.
     */
    public void saveRecord() {

    }

    /**
     * Client can upload a csv file to contribute some data.
     * However, since there will be some malicious use of this API,
     * it is necessary to check that if the data provided are valid.
     *
     * @param
     *
     */
    public void consumeCsv() {

    }
}
