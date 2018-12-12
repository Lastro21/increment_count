package com.testincrement.testincrement.controllers;

import com.testincrement.testincrement.regexp.ShareRegexp;
import com.testincrement.testincrement.service.Incrementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * SetMaxValueController for set max value
 */
@RestController
final public class SetMaxValueController {

    //private static final Logger LOGGER = Logger.getLogger(setMaxValueController.class);

    /**
     * Beans: <br>
     * Bean incrementor interface {@link com.testincrement.testincrement.service.impl.IncrementorImpl} <br>
     * Bean shareRegexp class {@link ShareRegexp}
     */
    private ShareRegexp shareRegexp;
    private Incrementor incrementor;

    /**
     *
     * @param param from input client side
     * @return success or error. Error if input param not valid
     * Success ip parameter is valid
     */
    @RequestMapping(value = "/setMaxValue", method = RequestMethod.POST)
    @ResponseBody
    public String getDataFromInput(@RequestParam(value = "param") String param) {
        //LOGGER.info(" = " + param);
        if (shareRegexp.regexpInputMaxValueCount(param) == true) {

            incrementor.setMaximumValue(Integer.parseInt(param));

            //LOGGER.info(confBeans.incrementor().getNumber());

            return "success";
        } else {
            return "error";
        }
    }

    @Autowired
    public void setShareRegexp(ShareRegexp shareRegexp) {
        this.shareRegexp = shareRegexp;
    }

    @Autowired
    public void setIncrementor(Incrementor incrementor) {
        this.incrementor = incrementor;
    }
}