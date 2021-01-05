package com.example.list_view_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class list_json extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_json);

        listView = findViewById(R.id.listview);

        String Teachers_array = "{\n" +
                "  \"title\": \"Teachers, Teacher T.\",\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI4S2\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.86\",\n" +
                "      \"subject\": \"andr1\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-26T10:30:00\",\n" +
                "      \"end\": \"2016-09-26T12:00:00\",\n" +
                "      \"uid\": \"06bc8207-4095-46e9-a073-58adccbe2490\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-26T12:45:00\",\n" +
                "      \"end\": \"2016-09-26T14:15:00\",\n" +
                "      \"uid\": \"fdfaeb14-e986-4e2a-a8b0-9bf7421a1da7\",\n" +
                "      \"hoursMask\": 96,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-26T14:30:00\",\n" +
                "      \"end\": \"2016-09-26T16:00:00\",\n" +
                "      \"uid\": \"bc9604dc-112b-4775-8c08-3c5ec887c085\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI7\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.72\",\n" +
                "      \"subject\": \"dpr\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-27T10:30:00\",\n" +
                "      \"end\": \"2016-09-27T12:00:00\",\n" +
                "      \"uid\": \"10ab569d-cbd7-49e6-aa05-1cee4ece6123\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-21T18:12:05.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI7\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.70\",\n" +
                "      \"subject\": \"dpr\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-28T08:45:00\",\n" +
                "      \"end\": \"2016-09-28T10:15:00\",\n" +
                "      \"uid\": \"5d0575a4-42c6-4feb-810b-d56a90d9dd50\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-08-29T19:12:05.933\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI3S3\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.84\",\n" +
                "      \"subject\": \"web3\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-28T12:45:00\",\n" +
                "      \"end\": \"2016-09-28T14:15:00\",\n" +
                "      \"uid\": \"b85dbcb7-c558-4999-8e89-71ae91bc48c9\",\n" +
                "      \"hoursMask\": 96,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-28T14:30:00\",\n" +
                "      \"end\": \"2016-09-28T16:00:00\",\n" +
                "      \"uid\": \"cfb97927-5e88-437e-a2cd-1e39e0cd8a6c\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI4S2\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.84\",\n" +
                "      \"subject\": \"andr1\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-29T10:30:00\",\n" +
                "      \"end\": \"2016-09-29T12:00:00\",\n" +
                "      \"uid\": \"ab485ac2-e5bf-4674-b86c-a2b0d9930078\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-21T18:12:05.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-29T14:30:00\",\n" +
                "      \"end\": \"2016-09-29T16:00:00\",\n" +
                "      \"uid\": \"804cb83d-ede8-4ee8-ae7b-d7257eb79778\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI3S3\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.72\",\n" +
                "      \"subject\": \"web3\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-30T08:45:00\",\n" +
                "      \"end\": \"2016-09-30T10:15:00\",\n" +
                "      \"uid\": \"76572722-6ffd-4188-ba1a-d2aa7097ce7f\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-18T17:42:05.567\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-09-30T10:30:00\",\n" +
                "      \"end\": \"2016-09-30T12:00:00\",\n" +
                "      \"uid\": \"cad46a6e-2f6d-41ef-8c6b-737b2844ec44\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI4S2\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.86\",\n" +
                "      \"subject\": \"andr1\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-03T10:30:00\",\n" +
                "      \"end\": \"2016-10-03T12:00:00\",\n" +
                "      \"uid\": \"c61ed51d-4ede-425a-a0c2-7dc6e5a6a342\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-03T12:45:00\",\n" +
                "      \"end\": \"2016-10-03T14:15:00\",\n" +
                "      \"uid\": \"f572939e-301a-4b2d-8740-f799b43e4809\",\n" +
                "      \"hoursMask\": 96,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-03T14:30:00\",\n" +
                "      \"end\": \"2016-10-03T16:00:00\",\n" +
                "      \"uid\": \"75edf0eb-92dd-4ca1-a7aa-6d365a330ea2\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI7\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.72\",\n" +
                "      \"subject\": \"dpr\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-04T10:30:00\",\n" +
                "      \"end\": \"2016-10-04T12:00:00\",\n" +
                "      \"uid\": \"aceb2776-93ce-49a5-9ac8-9492fb5555b0\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-21T18:12:05.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"SCHOLING\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_?\",\n" +
                "      \"subject\": \"didaktiek\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-05T08:45:00\",\n" +
                "      \"end\": \"2016-10-05T10:15:00\",\n" +
                "      \"uid\": \"8882f796-f247-4ab4-9960-c1c0eab50156\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"v16 wo1-4\",\n" +
                "      \"updatedAt\": \"2016-07-08T17:02:04.457\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI7\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.70\",\n" +
                "      \"subject\": \"dpr\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-05T08:45:00\",\n" +
                "      \"end\": \"2016-10-05T10:15:00\",\n" +
                "      \"uid\": \"df53eeca-a44e-47a6-bec4-f5f10cd5ff1b\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-08-29T19:12:05.933\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"SCHOLING\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_?\",\n" +
                "      \"subject\": \"didaktiek\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-05T10:30:00\",\n" +
                "      \"end\": \"2016-10-05T12:00:00\",\n" +
                "      \"uid\": \"f45a07fa-7efb-4660-ab8d-5f7a6a912914\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"v16 wo1-4\",\n" +
                "      \"updatedAt\": \"2016-07-08T17:02:04.457\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI3S3\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.84\",\n" +
                "      \"subject\": \"web3\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-05T12:45:00\",\n" +
                "      \"end\": \"2016-10-05T14:15:00\",\n" +
                "      \"uid\": \"5f2e0b6f-0293-41c3-9576-e8e49dcc0d57\",\n" +
                "      \"hoursMask\": 96,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-05T14:30:00\",\n" +
                "      \"end\": \"2016-10-05T16:00:00\",\n" +
                "      \"uid\": \"8122bac7-1088-4b40-a140-353c8b5d0e1e\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI4S2\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.84\",\n" +
                "      \"subject\": \"andr1\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-06T10:30:00\",\n" +
                "      \"end\": \"2016-10-06T12:00:00\",\n" +
                "      \"uid\": \"2c385d68-c78d-40b9-8c78-9b391af535f0\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-21T18:12:05.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-06T14:30:00\",\n" +
                "      \"end\": \"2016-10-06T16:00:00\",\n" +
                "      \"uid\": \"75d8c4b9-d9ca-43b5-b691-0c875a907e05\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI3S3\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.72\",\n" +
                "      \"subject\": \"web3\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-07T08:45:00\",\n" +
                "      \"end\": \"2016-10-07T10:15:00\",\n" +
                "      \"uid\": \"1a929bb4-37a0-47b2-bc9f-c0e81faec4f2\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-18T17:42:05.567\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-07T10:30:00\",\n" +
                "      \"end\": \"2016-10-07T12:00:00\",\n" +
                "      \"uid\": \"8dc96f90-a6e3-42a3-90b2-d4e69c3f1a46\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI4S2\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.86\",\n" +
                "      \"subject\": \"andr1\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-10T10:30:00\",\n" +
                "      \"end\": \"2016-10-10T12:00:00\",\n" +
                "      \"uid\": \"441bbd56-2c19-485b-8db9-4417b39a8f5f\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-10T12:45:00\",\n" +
                "      \"end\": \"2016-10-10T14:15:00\",\n" +
                "      \"uid\": \"d76e0dee-b898-4244-876b-0ea09fe1b76b\",\n" +
                "      \"hoursMask\": 96,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-10T14:30:00\",\n" +
                "      \"end\": \"2016-10-10T16:00:00\",\n" +
                "      \"uid\": \"697902cd-49a4-469d-b65a-908dddea73bf\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI7\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.72\",\n" +
                "      \"subject\": \"dpr\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-11T10:30:00\",\n" +
                "      \"end\": \"2016-10-11T12:00:00\",\n" +
                "      \"uid\": \"ab9f1f38-908e-416a-9006-891ad864beca\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-21T18:12:05.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI7\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.70\",\n" +
                "      \"subject\": \"dpr\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-12T08:45:00\",\n" +
                "      \"end\": \"2016-10-12T10:15:00\",\n" +
                "      \"uid\": \"63ab2225-68f7-4ca7-9dfd-48a511ac8664\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-08-29T19:12:05.933\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI3S3\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.84\",\n" +
                "      \"subject\": \"web3\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-12T12:45:00\",\n" +
                "      \"end\": \"2016-10-12T14:15:00\",\n" +
                "      \"uid\": \"c3fc83ba-d259-49f1-bab0-613b4187045b\",\n" +
                "      \"hoursMask\": 96,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-12T14:30:00\",\n" +
                "      \"end\": \"2016-10-12T16:00:00\",\n" +
                "      \"uid\": \"cd81e905-2a7d-4d55-9098-a9cd68ac6c51\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI4S2\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.84\",\n" +
                "      \"subject\": \"andr1\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-13T10:30:00\",\n" +
                "      \"end\": \"2016-10-13T12:00:00\",\n" +
                "      \"uid\": \"5db02c80-be0b-44fa-801e-9454e7518264\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-21T18:12:05.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-13T14:30:00\",\n" +
                "      \"end\": \"2016-10-13T16:00:00\",\n" +
                "      \"uid\": \"bc2443aa-99dc-4dcb-9dbe-45760e3756e2\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI3S3\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.72\",\n" +
                "      \"subject\": \"web3\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-14T08:45:00\",\n" +
                "      \"end\": \"2016-10-14T10:15:00\",\n" +
                "      \"uid\": \"cfb7ca23-44f9-41a1-bcdb-f1f080ebb3ae\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-18T17:42:05.567\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI1A\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.43\",\n" +
                "      \"subject\": \"edb1/2\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-14T10:30:00\",\n" +
                "      \"end\": \"2016-10-14T12:00:00\",\n" +
                "      \"uid\": \"67db1126-38a9-4515-8f97-ae80f734af64\",\n" +
                "      \"hoursMask\": 12,\n" +
                "      \"description\": \"t/p\",\n" +
                "      \"updatedAt\": \"2016-07-04T18:32:05.667\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-17T12:45:00\",\n" +
                "      \"end\": \"2016-10-17T14:15:00\",\n" +
                "      \"uid\": \"2b44c745-2b22-4466-8274-535933c37884\",\n" +
                "      \"hoursMask\": 96,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"EI2B\",\n" +
                "        \"EI2S1\",\n" +
                "        \"EI2S2\",\n" +
                "        \"EI2T\"\n" +
                "      ],\n" +
                "      \"room\": \"R1_2.40\",\n" +
                "      \"subject\": \"proP\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-17T14:30:00\",\n" +
                "      \"end\": \"2016-10-17T16:00:00\",\n" +
                "      \"uid\": \"bbda1c6a-fe4a-43da-a52d-8a26c3e3100c\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"b/zw\",\n" +
                "      \"updatedAt\": \"2016-07-06T19:22:05.27\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"INCIDENTEEL\"\n" +
                "      ],\n" +
                "      \"room\": \"\",\n" +
                "      \"subject\": \"meeting\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-21T08:45:00\",\n" +
                "      \"end\": \"2016-10-21T10:15:00\",\n" +
                "      \"uid\": \"30f2fca3-84c2-49d5-bb61-afdc4ad105e1\",\n" +
                "      \"hoursMask\": 3,\n" +
                "      \"description\": \"extern\",\n" +
                "      \"updatedAt\": \"2016-09-23T17:22:08.417\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"INCIDENTEEL\"\n" +
                "      ],\n" +
                "      \"room\": \"\",\n" +
                "      \"subject\": \"meeting\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-21T10:30:00\",\n" +
                "      \"end\": \"2016-10-21T14:15:00\",\n" +
                "      \"uid\": \"4e56b57f-3748-4335-b4b9-b0a51b9499e4\",\n" +
                "      \"hoursMask\": 124,\n" +
                "      \"description\": \"extern\",\n" +
                "      \"updatedAt\": \"2016-09-23T17:22:08.417\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"classes\": [\n" +
                "        \"INCIDENTEEL\"\n" +
                "      ],\n" +
                "      \"room\": \"\",\n" +
                "      \"subject\": \"meeting\",\n" +
                "      \"teacherAbbreviation\": \"teacher\",\n" +
                "      \"start\": \"2016-10-21T14:30:00\",\n" +
                "      \"end\": \"2016-10-21T16:00:00\",\n" +
                "      \"uid\": \"425a5f3b-4068-4170-a41b-f87797f785e1\",\n" +
                "      \"hoursMask\": 384,\n" +
                "      \"description\": \"extern\",\n" +
                "      \"updatedAt\": \"2016-09-23T17:22:08.417\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"numberOfDays\": 31,\n" +
                "  \"start\": \"2016-09-24T00:00:00+02:00\",\n" +
                "  \"teachers\": [\n" +
                "    {\n" +
                "      \"id\": \"i874073\",\n" +
                "      \"url\": \"https://api.fhict.nl/people/i874073\",\n" +
                "      \"givenName\": \"Teacher\",\n" +
                "      \"surName\": \"Teachers\",\n" +
                "      \"initials\": \"T\",\n" +
                "      \"displayName\": \"Teachers, Teacher T.\",\n" +
                "      \"mail\": \"t.teachers@fontys.nl\",\n" +
                "      \"office\": \"R1 2.00\",\n" +
                "      \"telephoneNumber\": \"08850-12345\",\n" +
                "      \"mobileNumber\": \"0612345678\",\n" +
                "      \"photo\": \"https://api.fhict.nl/pictures/i123456\",\n" +
                "      \"department\": \"Engelstalige opleiding\",\n" +
                "      \"title\": \"Medewerker FHICT\",\n" +
                "      \"personalTitle\": \"teacher\",\n" +
                "      \"affiliations\": [\n" +
                "        \"user\",\n" +
                "        \"staff\",\n" +
                "        \"teacher\"\n" +
                "      ],\n" +
                "      \"updatedAt\": \"2016-09-21T20:25:02\",\n" +
                "      \"uid\": \"123c45678f71de3887dedb5319b9b4a53888ab11\",\n" +
                "      \"employeeId\": \"12345\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"includeDeleted\": false,\n" +
                "  \"latestUpdate\": \"2016-09-23T17:22:08.417\"\n" +
                "}";
        try {
            JSONObject jsonObject = new JSONObject(Teachers_array);
            JSONArray jsonArray = jsonObject.getJSONArray("data");
             for(int i = 0; i<jsonArray.length(); i++)  {
                 JSONObject object = jsonArray.getJSONObject(i);
                 String teacherClasses = object.getString("classes");
                 String teacherRoom = object.getString("room");
                 String studentSubject = object.getString("subject");
                 arrayList.add(teacherRoom  +" || "+ studentSubject );
             }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),arrayList.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}