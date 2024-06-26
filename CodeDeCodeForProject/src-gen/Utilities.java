// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Utilities.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Utilities {
  public static Object toSet(Object C) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object x:GCollections.unmodifiableCollection(C)) {
        $v1.add(x);
      }
      $result=$v1;
      if (true) break $try;
      $line=6;
      $rethrow(new RuntimeException("The function \"toSet(C:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"toSet",$line);
    }
    return $result;
  }
  public static Object reverse(String s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=$invokeMethod("toString",$invokeMethod("reverse",$invokeConstructor(StringBuilder.class,new Object[]{s}),new Object[]{}),new Object[]{});
      if (true) break $try;
      $line=7;
      $rethrow(new RuntimeException("The function \"reverse(s:String)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"reverse",$line);
    }
    return $result;
  }
  public static Object testBlock(IAutomaton M, Object testCases) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=10;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=10;
      Object isTransducer=$fix($invokeMethod("isInstance",$invokeField(ITransducer.class,"class",true,null),new Object[]{M}));
      $line=12;
      for (Object $v3:GCollections.unmodifiableCollection(testCases)) {
        java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
        Object s=$v4.next();
        Object r=$v4.next();
        $line=13;
        Object result=$fix(((gold.structures.automaton.IAutomaton)M).acceptsString($cast(java.lang.String.class,s)));
        $line=13;
        Object t=$fix((($bool($opEqualY(s,"")))?("\u03BB"):(s)));
        $line=14;
        if (($opEqualY(r,result)&&$bool(result))) {
          $line=15;
          System.out.println($message(new Object[]{$opAdditY($opAdditY("String: ",t)," was correctly accepted")}));
        }
        else {
          $line=16;
          if ($opEqualY(r,result)) {
            $line=17;
            System.out.println($message(new Object[]{$opAdditY($opAdditY("String: ",t)," was correctly rejected")}));
          }
          else {
            $line=18;
            if ($bool(result)) {
              $line=19;
              System.out.println($message(new Object[]{$opAdditY($opAdditY("String: ",t)," was incorrectly accepted")}));
            }
            else {
              $line=21;
              System.out.println($message(new Object[]{$opAdditY($opAdditY("String: ",t)," was incorrectly rejected")}));
            }
          }
        }
      }
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"testBlock",$line);
    }
    return $result;
  }
  public static Object test(IAutomaton M, String add, Boolean rev) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=33;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=33;
      Object isTransducer=$fix($invokeMethod("isInstance",$invokeField(ITransducer.class,"class",true,null),new Object[]{M}));
      $line=34;
      while (true) {
        if (!($bool(true))) break;
        $line=35;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=36;
        System.out.println($message(new Object[]{"Input String (empty string to exit): "}));
        $line=38;
        Object string=$fix(((java.util.Scanner)sc).nextLine());
        $line=39;
        if ($opEqualY(string,"")) {
          $line=40;
          break;
        }
        $line=43;
        Object inputM=$fix(Utilities.toSet(((gold.structures.automaton.IAutomaton)M).getAlphabet()));
        $line=45;
        if ($bool(rev)) {
          $line=46;
          string=$fix(Utilities.reverse($cast(java.lang.String.class,string)));
          $line=47;
          System.out.println($message(new Object[]{$opAdditY("reverse: ",string)}));
        }
        $line=49;
        string=$fix($opAdditY(string,add));
        $line=50;
        if ($bool($invokeMethod("containsAll",((gold.structures.automaton.IAutomaton)M).getAlphabet(),new Object[]{string}))) {
          $line=52;
          Object result=$fix(((gold.structures.automaton.IAutomaton)M).acceptsString($cast(java.lang.String.class,string)));
          $line=54;
          System.out.println($message(new Object[]{$opAdditY($opAdditY("The string was ",(($bool(result))?("accepted!"):("rejected."))),(($bool(isTransducer))?(". Output:"):("")))}));
          $line=55;
          if ($bool(isTransducer)) {
            $line=56;
            System.out.println($message(new Object[]{$invokeMethod("getOutputString",$cast(ITransducer.class,M),new Object[]{})}));
            $line=57;
            if ($bool(rev)) {
              $line=58;
              System.out.println($message(new Object[]{$opAdditY("reverse: ",Utilities.reverse($cast(java.lang.String.class,$invokeMethod("getOutputString",$cast(ITransducer.class,M),new Object[]{}))))}));
            }
          }
        }
        else {
          $line=62;
          System.out.println($message(new Object[]{$opAdditY("Input contains invalid symbols: ",$opDiffeY(Utilities.toSet(string),inputM))}));
        }
      }
      $line=65;
      System.out.println($message(new Object[]{"Execution terminated"}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"test",$line);
    }
    return $result;
  }
  public static Object test(IAutomaton M) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=69;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=69;
      Object isTransducer=$fix($invokeMethod("isInstance",$invokeField(ITransducer.class,"class",true,null),new Object[]{M}));
      $line=70;
      while (true) {
        if (!($bool(true))) break;
        $line=71;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=72;
        System.out.println($message(new Object[]{"Input String (empty string to exit): "}));
        $line=74;
        Object string=$fix(((java.util.Scanner)sc).nextLine());
        $line=75;
        if ($opEqualY(string,"")) {
          $line=76;
          break;
        }
        $line=79;
        Object inputM=$fix(Utilities.toSet(((gold.structures.automaton.IAutomaton)M).getAlphabet()));
        $line=81;
        if ($bool($invokeMethod("containsAll",((gold.structures.automaton.IAutomaton)M).getAlphabet(),new Object[]{string}))) {
          $line=82;
          Object result=$fix(((gold.structures.automaton.IAutomaton)M).acceptsString($cast(java.lang.String.class,string)));
          $line=83;
          System.out.println($message(new Object[]{$opAdditY($opAdditY("The string was ",(($bool(result))?("accepted!"):("rejected."))),(($bool(isTransducer))?(". Output:"):("")))}));
          $line=84;
          if ($bool(isTransducer)) {
            $line=85;
            System.out.println($message(new Object[]{$invokeMethod("getOutputString",$cast(ITransducer.class,M),new Object[]{})}));
          }
        }
        else {
          $line=88;
          System.out.println($message(new Object[]{$opAdditY("Input contains invalid symbols: ",$opDiffeY(Utilities.toSet(string),inputM))}));
        }
      }
      $line=91;
      System.out.println($message(new Object[]{"Execution terminated"}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"test",$line);
    }
    return $result;
  }
  public static Object testR(IAutomaton M) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=95;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=95;
      Object isTransducer=$fix($invokeMethod("isInstance",$invokeField(ITransducer.class,"class",true,null),new Object[]{M}));
      $line=96;
      while (true) {
        if (!($bool(true))) break;
        $line=97;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=98;
        System.out.println($message(new Object[]{"Input String (empty string to exit): "}));
        $line=100;
        Object string=$fix(((java.util.Scanner)sc).nextLine());
        $line=101;
        if ($opEqualY(string,"")) {
          $line=102;
          break;
        }
        $line=105;
        Object inputM=$fix(Utilities.toSet(((gold.structures.automaton.IAutomaton)M).getAlphabet()));
        $line=107;
        if ($bool($invokeMethod("containsAll",((gold.structures.automaton.IAutomaton)M).getAlphabet(),new Object[]{string}))) {
          $line=108;
          Object result=$fix(((gold.structures.automaton.IAutomaton)M).acceptsString($cast(java.lang.String.class,$opAdditY(Utilities.reverse($cast(java.lang.String.class,string)),"$"))));
          $line=109;
          System.out.println($message(new Object[]{$opAdditY($opAdditY("The string was ",(($bool(result))?("accepted!"):("rejected."))),(($bool(isTransducer))?(". Output:"):("")))}));
          $line=110;
          if ($bool(isTransducer)) {
            $line=111;
            System.out.println($message(new Object[]{Utilities.reverse($cast(java.lang.String.class,$invokeMethod("getOutputString",$cast(ITransducer.class,M),new Object[]{})))}));
          }
        }
        else {
          $line=114;
          System.out.println($message(new Object[]{$opAdditY("Input contains invalid symbols: ",$opDiffeY(Utilities.toSet(string),inputM))}));
        }
      }
      $line=117;
      System.out.println($message(new Object[]{"Execution terminated"}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"testR",$line);
    }
    return $result;
  }
  public static Object testCodeDecodeRevAddDS(ITransducer C, ITransducer D) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=121;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=121;
      Object inputC=$fix(Utilities.toSet(((gold.structures.automaton.ITransducer)C).getInputAlphabet()));
      $line=121;
      Object inputD=$fix(Utilities.toSet(((gold.structures.automaton.ITransducer)D).getInputAlphabet()));
      $line=123;
      System.out.println($message(new Object[]{"Testing Coder- Reverse Decoder"}));
      $line=123;
      Object string=$fix(" ");
      $line=124;
      boolean $v5=false;
      while (true) {
        if ($v5) {
          if ($bool(false)) break;
        }
        $v5=true;
        $line=125;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=126;
        System.out.println($message(new Object[]{"Input string: (empty string to end)"}));
        $line=128;
        string=$fix(((java.util.Scanner)sc).nextLine());
        $line=129;
        if ($opEqualY(string,"")) {
          $line=130;
          break;
        }
        else {
          $line=132;
          Object option=$fix("");
          $line=133;
          while (true) {
            if (!(!$opMembrY(option,GCollections.asSet("1","2","3")))) break;
            $line=134;
            System.out.println($message(new Object[]{"What do you want to do?"}));
            $line=135;
            System.out.println($message(new Object[]{"1. code only?"}));
            $line=136;
            System.out.println($message(new Object[]{"2. code and decode (rev)?"}));
            $line=137;
            System.out.println($message(new Object[]{"3. decode only (rev)?"}));
            $line=139;
            option=$fix(((java.util.Scanner)sc).nextLine());
          }
          $line=141;
          Object stringOut=$fix("");
          $line=143;
          if (($opEqualY(option,"1")||$opEqualY(option,"2"))) {
            $line=145;
            if ($opSbsetY(Utilities.toSet(string),inputC)) {
              $line=146;
              Object result=$fix(((gold.structures.automaton.ITransducer)C).acceptsString($cast(java.lang.String.class,$opAdditY(string,"$"))));
              $line=147;
              System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The string was ",(($bool(result))?("accepted"):("not accepted"))),". Output: "),((gold.structures.automaton.ITransducer)C).getOutputString())}));
              $line=147;
              stringOut=$fix(((gold.structures.automaton.ITransducer)C).getOutputString());
              $line=148;
              if ($opEqualY(option,"2")) {
                $line=149;
                if ($opSbsetY(Utilities.toSet(stringOut),inputD)) {
                  $line=151;
                  result=$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,$opAdditY(Utilities.reverse($cast(java.lang.String.class,stringOut)),"$"))));
                  $line=151;
                  Object stringOut1R=$fix(Utilities.reverse($cast(java.lang.String.class,((gold.structures.automaton.ITransducer)D).getOutputString())));
                  $line=153;
                  System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The Reverse of the coded string was ",(($bool(result))?("accepted"):("not accepted"))),". Output: "),Utilities.reverse($cast(java.lang.String.class,((gold.structures.automaton.ITransducer)D).getOutputString())))}));
                  $line=154;
                  System.out.println($message(new Object[]{$opAdditY($opAdditY("The Reverse of the decoded string is ",((!$opEqualY(stringOut1R,string))?("not "):(""))),"equal to the original string.")}));
                }
                else {
                  $line=156;
                  System.out.println($message(new Object[]{$opAdditY("Output contains invalid symbols for the decoder: ",$opDiffeY(Utilities.toSet(stringOut),inputD))}));
                }
              }
            }
            else {
              $line=161;
              System.out.println($message(new Object[]{$opAdditY("Input contains invalid symbols: ",$opDiffeY(Utilities.toSet(string),inputC))}));
            }
          }
          else {
            $line=164;
            if ($opSbsetY(Utilities.toSet(string),inputD)) {
              $line=165;
              Object result=$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,$opAdditY(Utilities.reverse($cast(java.lang.String.class,string)),"$"))));
              $line=166;
              System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The string was ",(($bool(result))?("accepted"):("not accepted")))," by the decoder. Output: "),Utilities.reverse($cast(java.lang.String.class,((gold.structures.automaton.ITransducer)D).getOutputString())))}));
            }
            else {
              $line=168;
              System.out.println($message(new Object[]{$opAdditY("Input contains invalid symbols: ",$opDiffeY(Utilities.toSet(string),inputD))}));
            }
          }
        }
      }
      $line=175;
      System.out.println($message(new Object[]{"Execution Ended"}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"testCodeDecodeRevAddDS",$line);
    }
    return $result;
  }
  public static Object testCodeDecode(ITransducer C, ITransducer D) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=179;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=179;
      Object inputC=$fix(Utilities.toSet(((gold.structures.automaton.ITransducer)C).getInputAlphabet()));
      $line=179;
      Object inputD=$fix(Utilities.toSet(((gold.structures.automaton.ITransducer)D).getInputAlphabet()));
      $line=181;
      System.out.println($message(new Object[]{"Testing Coder-Decoder"}));
      $line=181;
      Object string=$fix(" ");
      $line=182;
      boolean $v6=false;
      while (true) {
        if ($v6) {
          if ($bool(false)) break;
        }
        $v6=true;
        $line=183;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=184;
        System.out.println($message(new Object[]{"Input string: (empty string to end)"}));
        $line=186;
        string=$fix(((java.util.Scanner)sc).nextLine());
        $line=187;
        if ($opEqualY(string,"")) {
          $line=188;
          break;
        }
        else {
          $line=190;
          Object option=$fix("");
          $line=191;
          while (true) {
            if (!(!$opMembrY(option,GCollections.asSet("1","2","3")))) break;
            $line=192;
            System.out.println($message(new Object[]{"What do you want to do?"}));
            $line=193;
            System.out.println($message(new Object[]{"1. code only?"}));
            $line=194;
            System.out.println($message(new Object[]{"2. code and decode?"}));
            $line=195;
            System.out.println($message(new Object[]{"3. decode only?"}));
            $line=197;
            option=$fix(((java.util.Scanner)sc).nextLine());
          }
          $line=199;
          Object stringOut=$fix("");
          $line=200;
          if (($opEqualY(option,"1")||$opEqualY(option,"2"))) {
            $line=202;
            if ($opSbsetY(Utilities.toSet(string),inputC)) {
              $line=203;
              Object result=$fix(((gold.structures.automaton.ITransducer)C).acceptsString($cast(java.lang.String.class,string)));
              $line=204;
              System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The string was ",(($bool(result))?("accepted"):("not accepted"))),". Output: "),((gold.structures.automaton.ITransducer)C).getOutputString())}));
              $line=204;
              stringOut=$fix(((gold.structures.automaton.ITransducer)C).getOutputString());
              $line=205;
              if ($opEqualY(option,"2")) {
                $line=206;
                if ($opSbsetY(Utilities.toSet(stringOut),inputD)) {
                  $line=207;
                  result=$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,stringOut)));
                  $line=208;
                  System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The coded string was ",(($bool(result))?("accepted"):("not accepted"))),". Output: "),((gold.structures.automaton.ITransducer)D).getOutputString())}));
                  $line=208;
                  Object stringOut1=$fix(((gold.structures.automaton.ITransducer)D).getOutputString());
                  $line=209;
                  System.out.println($message(new Object[]{$opAdditY($opAdditY("The decoded string is ",((!$opEqualY(stringOut1,string))?("not "):(""))),"equal to the original string.")}));
                }
                else {
                  $line=211;
                  System.out.println($message(new Object[]{$opAdditY("Output contains invalid symbols for the decoder: ",$opDiffeY(Utilities.toSet(stringOut),inputD))}));
                }
              }
            }
            else {
              $line=216;
              System.out.println($message(new Object[]{$opAdditY("Input contains invalid symbols: ",$opDiffeY(Utilities.toSet(string),inputC))}));
            }
          }
          else {
            $line=219;
            if ($opSbsetY(Utilities.toSet(string),inputD)) {
              $line=220;
              Object result=$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,string)));
              $line=221;
              System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The string was ",(($bool(result))?("accepted"):("not accepted")))," by the decoder. Output: "),((gold.structures.automaton.ITransducer)D).getOutputString())}));
            }
            else {
              $line=223;
              System.out.println($message(new Object[]{$opAdditY("Input contains invalid symbols: ",$opDiffeY(Utilities.toSet(string),inputD))}));
            }
          }
        }
      }
      $line=230;
      System.out.println($message(new Object[]{"Execution Ended"}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Utilities.class,"testCodeDecode",$line);
    }
    return $result;
  }
}
