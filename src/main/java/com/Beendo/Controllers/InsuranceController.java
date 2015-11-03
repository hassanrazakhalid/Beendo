package com.Beendo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Beendo.Entities.Insurance;
import com.Beendo.Entities.Physician;
import com.Beendo.HibernateUtils.Constants;
import com.Beendo.Service.InsuranceService;

@Controller
public class InsuranceController {

	
	@Autowired
	InsuranceService insuranceService;
	
	
	@RequestMapping(value = "/insurance", method = RequestMethod.GET)
	public ModelAndView Insurance(){
		
		ModelAndView mv = new ModelAndView("insurance");		
		addBaseUrl(mv);
		
		List<Insurance> list = insuranceService.GetAll();
		mv.addObject("Insurances", list);
		mv.addObject("insurance", new Insurance());
		
		return mv;
	
	}
	
	
	@RequestMapping(value = "/saveInsurance", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("insurance")Insurance insurance, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        Insurance entity = new Insurance();
		entity.setName(insurance.getName());
		insuranceService.Save(entity);
		
        return "redirect:/insurance";
    }	
	
	@RequestMapping(value = "/insurance/delete/{id}")
    public String delete(Model model, @PathVariable int id) {

		insuranceService.Delete(id);
		
        return "redirect:/insurance";
    }
	
	
	@RequestMapping(value = "/insurance/edit")
	public String edit(@Valid @ModelAttribute("insurance")Insurance insurance, 
		      BindingResult result, ModelMap model) {
		        if (result.hasErrors()) {
		            return "error";
		        }

//		Insurance entity = new Insurance();
//		entity.setId(insurance.getId());
//		entity.setName(insurance.getName());
		        
		insuranceService.Update(insurance);
		
        return "redirect:/insurance";
    }	
	
	
	private void addBaseUrl(ModelAndView mv){
		
		String url = Constants.URL+ ":"+ Constants.PORT + "/" + Constants.ROOT + "/";
		mv.addObject("BaseURL", url);
	}
	
	
}
