package net.jeeeyul.eclipse.themes.preference;

import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;

public interface IChromeThemeConfig {
	public abstract RGB getActiveOulineColor();

	public abstract RGB getActivePartGradientEnd();

	public abstract RGB getActivePartGradientStart();

	public abstract RGB getActiveSelectedTitleColor();

	public abstract RGB getActiveUnselectedTitleColor();

	public abstract RGB getInactiveOulineColor();

	public abstract RGB getInactivePartGradientEnd();

	public abstract RGB getInactivePartGradientStart();

	public abstract RGB getInactiveSelectedTitleColor();

	public abstract RGB getInactiveUnselectedTitleColor();

	public abstract FontData getPartFontData();

	public abstract int getSashWidth();

	public abstract Boolean useActivePartTitleShadow();

	public Boolean useInactivePartTitleShadow();

	public abstract boolean usePartShadow();
}