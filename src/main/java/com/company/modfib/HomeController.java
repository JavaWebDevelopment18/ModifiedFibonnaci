package com.company.modfib;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String loadFromPage(){
        return "hometemplate";
    }


    public int[] memo;
    //public String memostring;

    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("newnumber") int newnumber, Model model) {
        model.addAttribute("inputval", newnumber);

        //memo = new int[newnumber + 1];
        //for (int x = 0; x <= newnumber + 1; x++){
        //    memo[x] = -1;
        //}
        //memo[0] = 0;
        //memo[1] = 1;
        //memo[2] = 1;
        //memo[3] = 2;
        //memo[4] = 4;

        int y = Fibonnaci(newnumber);

        //memostring = switchArray(memo, newnumber);
        model.addAttribute("Fibonnaci", y);
        //model.addAttribute("Sequence", memostring);
        return "confirm";
    }

    public int Fibonnaci(int x){
        if (x == 0) {
            return 0;
        } else if (x == 1 || x == 2) {
            return 1;
        } else if (x == 3) {
            return 2;
        } else if(x >= 4){

            return Fibonnaci(x - 1) + Fibonnaci(x - 2) + Fibonnaci(x - 3) + Fibonnaci(x - 4);
        }
        return -1;
    }

    /*public String switchArray(int[] memo, int n){
    *    for(int x = 0; x <= n + 1; x++){
    *        memostring += Integer.toString(x) + "   ";
    *    }
    *    return memostring;
    *    }
    */}






