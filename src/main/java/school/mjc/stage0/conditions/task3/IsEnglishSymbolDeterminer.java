package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String res = (symbol > '\101' && symbol < '\132' ||
                      symbol > '\141' && symbol < '\172') ? "English" : "Non English";
        System.out.println(res);
    }
}
