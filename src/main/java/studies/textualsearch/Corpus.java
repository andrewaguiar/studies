package studies.textualsearch;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Corpus {
	private Map<String, Document> documentMap;

	public Corpus(List<Document> documents) {
		documentMap = new LinkedHashMap<String, Document>();
		for (Document document : documents) {
			this.documentMap.put(document.getId(), document);
		}
	}

	public double getNumberOfDocuments() {
		return documentMap.size();
	}

	public double getNumberOfDocumentsContainingTerm(Term t) {
		double count = 0;
		for (Document document : documentMap.values()) {
			if (document.containsTerm(t)) {
				count++;
			}
		}
		return count;
	}

	public Collection<Document> getDocuments() {
		return documentMap.values();
	}
}
