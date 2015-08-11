/**
 * Created by HARISH on 4/24/2015.
 */
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class SaveTheHack {
    public static void main(String[] args) throws ScriptException {
        // write your code here
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String expr = "1&(!1|!0)";
        System.out.println(engine.eval(expr));
    }
}
