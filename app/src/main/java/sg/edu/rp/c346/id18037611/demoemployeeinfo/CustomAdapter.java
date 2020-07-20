package sg.edu.rp.c346.id18037611.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmpInfo> EmpInfoList;

    public CustomAdapter(Context context, int resource, ArrayList<EmpInfo > objects) {

        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        EmpInfoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvPos = rowView.findViewById(R.id.textViewPosition);
        TextView tvPay = rowView.findViewById(R.id.textViewPay);

        // Obtain the Task information based on the position
        EmpInfo  currentTask = EmpInfoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentTask.getName());
        tvPos.setText(currentTask.getRole());
        tvPay.setText(currentTask.getPay()+"");

        return rowView;
    }
}
