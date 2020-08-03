package NotifySolution.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HalloWorldController {
    @RequestMapping("/spsample") // �A�N�Z�X��URI�Ɋ֘A����
    public ModelAndView page(ModelAndView mav) {
        mav.setViewName("sample"); // HTML�t�@�C�������g���q�����Ŏw�肷��
        ModelMap m = mav.getModelMap();
        m.addAttribute("modelValue", "modelValue");
        return mav;
//        return Content("Hello World");
    }
}