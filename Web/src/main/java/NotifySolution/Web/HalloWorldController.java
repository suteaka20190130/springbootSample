package NotifySolution.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HalloWorldController {
    @RequestMapping("/spsample") // アクセス先URIに関連する
    public ModelAndView page(ModelAndView mav) {
        mav.setViewName("sample"); // HTMLファイル名を拡張子無しで指定する
        ModelMap m = mav.getModelMap();
        m.addAttribute("modelValue", "modelValue");
        return mav;
//        return Content("Hello World");
    }
}
