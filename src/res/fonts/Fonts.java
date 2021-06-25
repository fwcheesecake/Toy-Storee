package res.fonts;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class Fonts {
    //Public Members
    public static Font get(String font, float size) {
        if(fonts.isEmpty()) {
            try {
                String[] fontNames = {"Black", "BlackItalic", "Bold", "BoldItalic", "ExtraBold",
                        "ExtraBoldItalic", "ExtraLight", "ExtraLightItalic", "Italic", "Light",
                        "LightItalic", "Medium", "MediumItalic", "Regular", "SemiBold",
                        "SemiBoldItalic", "Thin", "ThinItalic"};

                for(String s : fontNames) {
                    InputStream fontStream =
                            Fonts.class.getResourceAsStream("Montserrat-" + s + ".ttf");
                    assert fontStream != null;
                    Font f = Font.createFont(Font.TRUETYPE_FONT, fontStream);
                    fonts.put(s, f);
                }
            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
            }
        }
        return fonts.get(font).deriveFont(size);
    }

    //Private Members
    private static final HashMap<String, Font> fonts = new HashMap<>();
}
