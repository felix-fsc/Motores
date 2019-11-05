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
		doc.addField("name", "Felix Sancha Cimbora");
		doc.addField("age", 23);
                doc.addField("email", "felixscimbora@gmail.com");
		solr.add(doc);
		solr.commit();
	}
    
}