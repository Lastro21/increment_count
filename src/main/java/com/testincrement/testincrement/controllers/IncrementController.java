package com.testincrement.testincrement.controllers;

import com.testincrement.testincrement.service.Incrementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * IncrementController for increment count <br>
 * logic here {@link com.testincrement.testincrement.service.impl.IncrementorImpl}
 */
@RestController
final public class IncrementController {

    //private static final Logger LOGGER = Logger.getLogger(setMaxValueController.class);

    /**
     * Bean incrementor interface {@link com.testincrement.testincrement.service.impl.IncrementorImpl}
     */
    private Incrementor incrementor;

    /**
     *
     * @return count value
     */
    @RequestMapping(value = "/increment", method = RequestMethod.POST)
    @ResponseBody
    public int getDataFromInput() {
        incrementor.incrementNumber();
        //LOGGER.info(confBeans.incrementor().getNumber());
        return incrementor.getNumber();
    }

    @Autowired
    public void setIncrementor(Incrementor incrementor) {
        this.incrementor = incrementor;
    }
}
