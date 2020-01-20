package ar.gis.mvc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GisController {

    private Logger log = LoggerFactory.getLogger(GisController.class);

    @RequestMapping(value="/lista", method = RequestMethod.GET)
    public @ResponseBody List<Object> getLista(@RequestParam(value="crimeCatId") Integer crimeCatId) throws Exception{    
                try {
                    //return this.crimeTypeManager.getCrimeTypeList(crimeCatId);
                    return new ArrayList<Object>();
                    //return "true";
                } catch (Exception e) {
                    log.error(e.getMessage());
                    return null;
                }
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public @ResponseBody ModelAndView getRoot() throws Exception{    
                try {
                    //return this.crimeTypeManager.getCrimeTypeList(crimeCatId);
                    //return new ArrayList<Object>();
                    ModelAndView viewName = new ModelAndView();//this, null, Status.ACCEPTED);
                    return viewName;
                } catch (Exception e) {
                    log.error(e.getMessage());
                    return null;
                }
    }

}