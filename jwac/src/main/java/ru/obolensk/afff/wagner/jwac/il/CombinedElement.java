package ru.obolensk.afff.wagner.jwac.il;

public abstract class CombinedElement<T extends Element> extends Element {
	
	private final T[] childs;

	@SuppressWarnings("unchecked")
	public CombinedElement(String name, T... childs) {
		super(name);
		this.childs = childs;
	}
	
	public T[] getChilds() {
		return childs.clone();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		if (childs.length != 0) {
			sb.append("\n");
			printChilds(sb, getChilds(), 0);
		}
		return sb.toString();
	}

	private void printChilds(StringBuilder sb, Element[] childs, int level) {
		for (Element child : childs) {
			tabulate(sb, level+1);
			if (child instanceof Command) {
				sb.append(child.toString() + "\n");
			} else if (child instanceof CombinedElement) {
				sb.append(child.getName() + "\n");
				CombinedElement<?> subCombined = (CombinedElement<?>) child;
				printChilds(sb, subCombined.getChilds(), level+1);
			} else {
				sb.append(child.toString() + "\n");
			}
		}
	}

	private void tabulate(StringBuilder sb, int level) {
		for (int i = 0; i < level; i++) {
			sb.append("  ");
		}
	}
}
