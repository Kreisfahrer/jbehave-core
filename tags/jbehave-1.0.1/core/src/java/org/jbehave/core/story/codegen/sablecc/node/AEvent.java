/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jbehave.core.story.codegen.sablecc.node;

import org.jbehave.core.story.codegen.sablecc.analysis.Analysis;

public final class AEvent extends PEvent
{
    private TWhen _when_;
    private TSpace _space_;
    private PPhrase _phrase_;
    private TEndl _endl_;

    public AEvent()
    {
    }

    public AEvent(
        TWhen _when_,
        TSpace _space_,
        PPhrase _phrase_,
        TEndl _endl_)
    {
        setWhen(_when_);

        setSpace(_space_);

        setPhrase(_phrase_);

        setEndl(_endl_);

    }
    public Object clone()
    {
        return new AEvent(
            (TWhen) cloneNode(_when_),
            (TSpace) cloneNode(_space_),
            (PPhrase) cloneNode(_phrase_),
            (TEndl) cloneNode(_endl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEvent(this);
    }

    public TWhen getWhen()
    {
        return _when_;
    }

    public void setWhen(TWhen node)
    {
        if(_when_ != null)
        {
            _when_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _when_ = node;
    }

    public TSpace getSpace()
    {
        return _space_;
    }

    public void setSpace(TSpace node)
    {
        if(_space_ != null)
        {
            _space_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _space_ = node;
    }

    public PPhrase getPhrase()
    {
        return _phrase_;
    }

    public void setPhrase(PPhrase node)
    {
        if(_phrase_ != null)
        {
            _phrase_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _phrase_ = node;
    }

    public TEndl getEndl()
    {
        return _endl_;
    }

    public void setEndl(TEndl node)
    {
        if(_endl_ != null)
        {
            _endl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _endl_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_when_)
            + toString(_space_)
            + toString(_phrase_)
            + toString(_endl_);
    }

    void removeChild(Node child)
    {
        if(_when_ == child)
        {
            _when_ = null;
            return;
        }

        if(_space_ == child)
        {
            _space_ = null;
            return;
        }

        if(_phrase_ == child)
        {
            _phrase_ = null;
            return;
        }

        if(_endl_ == child)
        {
            _endl_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_when_ == oldChild)
        {
            setWhen((TWhen) newChild);
            return;
        }

        if(_space_ == oldChild)
        {
            setSpace((TSpace) newChild);
            return;
        }

        if(_phrase_ == oldChild)
        {
            setPhrase((PPhrase) newChild);
            return;
        }

        if(_endl_ == oldChild)
        {
            setEndl((TEndl) newChild);
            return;
        }

    }
}