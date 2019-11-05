package pr1;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;


public class Indexacion {

    public static void main(String[] args) throws IOException,
			SolrServerException {

                HttpSolrClient solr = new HttpSolrClient.Builder("http://localhost:8983/solr/gettingstarted").build();
		
		//Create solr document
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("name", "Manuel de la Villa");
		doc.addField("age", 46);
                doc.addField("email", "manuel.villa@dti.uhu.es");
		solr.add(doc);
		solr.commit();
	}
    
}