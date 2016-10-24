package com.example.digitalhouse.entregableintegrador;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class AdaptadorViewPager extends FragmentStatePagerAdapter {

    private List<Fragment> listaFragments;

    public AdaptadorViewPager(FragmentManager fm) {
        super(fm);
        listaFragments = new ArrayList<>();

        Resto central = new Resto("Central", "Lima, Perú", R.drawable.central);
        Resto borago = new Resto("Boragó", "Santiago, Chile", R.drawable.borago);
        Resto astrid = new Resto("Astrid y Gastón", "Lima, Perú", R.drawable.astridygaston);
        Resto dom = new Resto("D.O.M.", "San Pablo, Brasil", R.drawable.dom);
        Resto maido = new Resto("Maido", "Lima, Perú", R.drawable.maido);
        Resto quintonil = new Resto("Quintonil", "Ciudad de México", R.drawable.quintonil);
        Resto tegui = new Resto("Tegui", "Buenos Aires, Argentina", R.drawable.tegui);
        Resto mani = new Resto("Maní", "San Pablo, Brasil", R.drawable.mani);

        listaFragments.add(RestoFragment.dameUnFragment(central));
        listaFragments.add(RestoFragment.dameUnFragment(borago));
        listaFragments.add(RestoFragment.dameUnFragment(astrid));
        listaFragments.add(RestoFragment.dameUnFragment(dom));
        listaFragments.add(RestoFragment.dameUnFragment(maido));
        listaFragments.add(RestoFragment.dameUnFragment(quintonil));
        listaFragments.add(RestoFragment.dameUnFragment(tegui));
        listaFragments.add(RestoFragment.dameUnFragment(mani));
    }

    @Override
    public Fragment getItem(int position) {
        return this.listaFragments.get(position);
    }

    @Override
    public int getCount() {
        return this.listaFragments.size();
    }
}
