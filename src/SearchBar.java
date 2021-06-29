import res.fonts.Fonts;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SearchBar extends JPanel {
    //Public Members
    public SearchBar() {
        super();
        this.setLayout(null);
        this.setBackground(Colors.WHITE);

        initComponents();
        addComponents();
    }

    //Private Members
    private String hint;
    private JLabel icon;
    private FancyTextField searchField;

    private void initComponents() {
        hint = "Search products";

        icon = new JLabel(new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/res" +
                "/icons/search_icon.png"))));

        searchField = new FancyTextField(hint);
        searchField.setBackground(Colors.WHITE);
        searchField.setHintColor(Colors.BLACK);
        searchField.setTextColor(Colors.BLACK);
        searchField.setBorder(null);
        searchField.setFont(Fonts.get("Regular", 16));
    }
    private void addComponents() {
        icon.setBounds(6, 2, 24, 24);
        this.add(icon);

        searchField.setBounds(30, 2, 164, 24);
        this.add(searchField);
    }
}
